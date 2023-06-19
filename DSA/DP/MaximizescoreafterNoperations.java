/*You are given nums, an array of positive integers of size 2 * n. You must perform n operations on this array.

In the ith operation (1-indexed), you will:

Choose two elements, x and y.
Receive a score of i * gcd(x, y).
Remove x and y from nums.
Return the maximum score you can receive after performing n operations.

The function gcd(x, y) is the greatest common divisor of x and y.*/

 







class Solution {
    int[] memo;
    public int maxScore(int[] nums) {
        int n = nums.length;
        memo = new int[1 << n];
        Arrays.fill(memo, -1);
        return dp( 0, nums);
    }

    private int dp(int bitmask, int[] nums){
        int setBits = 0;
        int b = bitmask;

        while(b > 0){
            setBits += (b & 1);
            b = b >> 1;
        }

        if(setBits == nums.length){
            return 0;
        }

        int op = 1 + (setBits / 2);
        if(memo[bitmask] == -1){
            int maxVal = 0;
            for(int i = 0; i < nums.length; i++){
                if((bitmask & (1 << i)) == 0){
                    for(int j = i + 1; j < nums.length; j++){
                        if((bitmask & (1 << j)) == 0){
                            maxVal = Math.max(maxVal, op * gcd(nums[i], nums[j]) + dp(bitmask | (1 << i) | (1 << j), nums));
                        }
                    }                   
                }
            }
            memo[bitmask] = maxVal;
        }

        return memo[bitmask];

   }

   private int gcd(int a, int b){
       if(b == 0) return a;
       return gcd(b, a % b);
   }
}

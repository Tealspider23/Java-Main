/*Given a wooden stick of length n units. The stick is labelled from 0 to n. For example, a stick of length 6 is labelled as follows:


Given an integer array cuts where cuts[i] denotes a position you should perform a cut at.

You should perform the cuts in order, you can change the order of the cuts as you wish.

The cost of one cut is the length of the stick to be cut, the total cost is the sum of costs of all cuts. When you cut a stick, it will be split into two smaller sticks (i.e. the sum of their lengths is the length of the stick before the cut). Please refer to the first example for a better explanation.

Return the minimum total cost of the cuts.
*/


class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] newCuts = new int[m + 2];
        System.arraycopy(cuts, 0, newCuts, 1, m);
        newCuts[m + 1] = n;
        Arrays.sort(newCuts);
        
        int[][] dp = new int[m + 2][m + 2];
        
        for (int diff = 2; diff < m + 2; ++diff) {
            for (int l = 0; l < m + 2 - diff; ++l) {
                int r = l + diff;
                int ans = Integer.MAX_VALUE;
                for (int mid = l + 1; mid < r; ++mid) {
                    ans = Math.min(ans, dp[l][mid] + dp[mid][r] + newCuts[r] - newCuts[l]);
                }
                dp[l][r] = ans;
            }
        } 
        
        return dp[0][m + 1];
    }    
}

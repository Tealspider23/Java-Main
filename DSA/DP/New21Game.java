/*Alice plays the following game, loosely based on the card game "21".

Alice starts with 0 points and draws numbers while she has less than k points. During each draw, she gains an integer number of points randomly from the range [1, maxPts], where maxPts is an integer. Each draw is independent and the outcomes have equal probabilities.

Alice stops drawing numbers when she gets k or more points.

Return the probability that Alice has n or fewer points.

Answers within 10-5 of the actual answer are considered accepted.
*/

/*
[1..maxpts]
maxpts=6
k=18->threshold
n=21
solution = P(n) + P(n-1).. +P(k)

[k..n]

DP[i]->The probability of reaching the number

DP[14]->DP[13]*P(1) +DP[12]*P(2) ...DP[14-maxpts]P(maxpts) ->Maximum distance from where you can reach 14 .

DP[i] ->DP[i-1]P(1) + DP[i-2]P(2) .... + DP[i-maxpts]P(maxpts)

DP[i] ->DP[i-1](1/mxpts) + DP[i-2](1/maxpts) .... + DP[i-maxpts]1/maxpts

DP[i] -> 1/maxpts (DP[i-1] + DP[i-2] .... + DP[i-maxpts])

DP[3]?->edge case <- DP[21]?

*/

class Solution {
    public double new21Game(int n, int k, int maxPts) {
       
       if (k > n)
      return 0;
       if (k == 0 || k + maxPts <= n)
     return 1;

       int steps = k + maxPts;

    List<Double> dp = new ArrayList<>(n + 1);
    for (int i = 0; i <= n; i++) {
        dp.add(0.0);
    }
    
    double ans = 0.0, cum = 1.0;

    dp.set(0, 1.0);
    for (int j = 1; j <= n; j++) {
        dp.set(j, cum / maxPts);
        if (j < k)
            cum += dp.get(j);
        if (j - maxPts >= 0)
            cum -= dp.get(j - maxPts);
    }
    
    for (int i = k; i <= n; i++)
        ans += dp.get(i);
    
    return ans;
}
}






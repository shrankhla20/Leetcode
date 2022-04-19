class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int N = cost.length;
        int[] dp = new int[N];
        for(int i =0; i<N; i++){
            if(i <= 1){
                dp[i] = cost[i];
                continue;
            }
            int ans = Math.min(dp[i-2],dp[i-1]) + cost[i];
            dp[i] = ans;
        }
        return Math.min(dp[N-2], dp[N-1]);
    }
}
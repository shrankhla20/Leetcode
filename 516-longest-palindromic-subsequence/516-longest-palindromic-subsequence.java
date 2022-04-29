class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        return lpss(s,0,n-1,dp);
    }
    public int lpss(String s, int I, int J, int[][] dp){
        int N = s.length();
        for(int gap = 0; gap<N;gap++){
            for(int i =0, j= gap; j<N; i++,j++){
                if(i >= j){
                    dp[i][j] = (i == j ? 1 : 0);
                    continue;
                }
        
        
                if(s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i+1][j-1] + 2;
                else
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[I][J];
    }
}
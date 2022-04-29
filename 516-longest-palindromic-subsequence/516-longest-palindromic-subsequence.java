class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        return lpss(s,0,n-1,dp);
    }
    public int lpss(String s, int i, int j, int[][] dp){
        if(i >= j)
            return dp[i][j] = (i == j ? 1 : 0);
        
        if(dp[i][j] != 0)
            return dp[i][j];
        
        if(s.charAt(i) == s.charAt(j))
            return dp[i][j] = lpss(s,i+1,j-1,dp) + 2;
        else
            return dp[i][j] = Math.max(lpss(s,i+1,j,dp),lpss(s,i,j-1,dp));
    }
}
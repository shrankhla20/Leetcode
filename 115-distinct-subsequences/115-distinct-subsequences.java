class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] d : dp)Arrays.fill(d,-1);
        
        return numDistinct(s,t,n,m,dp);
    }
    public int numDistinct(String s, String t, int N, int M, int[][] dp) {
        for(int n =0; n<= N; n++){
            for(int m = 0; m<= M; m++){
                if(m == 0){
                    dp[n][m] = 1;
                    continue;
                }
                if(n<m){
                    dp[n][m] = 0;
                    continue;
                }
                int a = dp[n-1][m-1];//numDistinct(s,t,n-1,m-1,dp);
                int b = dp[n-1][m]; //numDistinct(s,t,n-1,m,dp);
                if(s.charAt(n-1) == t.charAt(m-1))dp[n][m] = a+b;
                else dp[n][m] = b;
        
            }
        }
        return dp[N][M];
    }
}
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int[][] dir = {{0,1},{1,0}};
        return uniquePath(m-1,n-1,dp,dir);
    }
    public int uniquePath(int ER, int EC, int[][] dp, int[][] dir ){
        for(int sr=ER; sr>= 0; sr--){
            for(int sc = EC; sc>= 0; sc--){
                if(ER == sr && EC == sc){
                    dp[sr][sc] = 1;
                    continue;
                }
                
                int count = 0;
                for(int[] d: dir){
                    int r = sr + d[0] , c = sc + d[1];
                    if(r >= 0 && c >=0 && r < dp.length && c < dp[0].length){
                        count += dp[r][c];
                    }
                }
                dp[sr][sc] = count;
            }
        }
        return dp[0][0];
    }
}
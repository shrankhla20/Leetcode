class Solution {
    public int numDecodings(String s, int IDX, int[] dp){
        for(int idx = s.length(); idx >= 0; idx--){
            if(idx == s.length()){
               dp[idx] = 1;
                continue;
            }
        
            char ch = s.charAt(idx);
            if(ch == '0'){
                dp[idx] = 0;
                continue;
            }
            int count = dp[idx+1];
        
            if(idx < s.length() -1){
                char ch1 = s.charAt(idx +1);
                int num = (ch - '0')*10 + (ch1-'0');
                if(num <= 26)
                    count += dp[idx+2];
            }
            dp[idx] = count;
        }
        return dp[IDX];
    }
    
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return numDecodings(s,0,dp);
    }
}
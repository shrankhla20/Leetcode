class Solution {
    public int numDecodings(String s, int idx, int[] dp){
        if(idx == s.length())
            return dp[idx] = 1;
        
        if(dp[idx] != -1)return dp[idx];
        
        char ch = s.charAt(idx);
        if(ch == '0')return dp[idx] = 0;
        int count = numDecodings(s,idx+1,dp);
        
        if(idx < s.length() -1){
            char ch1 = s.charAt(idx +1);
            int num = (ch - '0')*10 + (ch1-'0');
            if(num <= 26)
                count += numDecodings(s,idx+2,dp);
        }
        return dp[idx] = count;
    }
    
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return numDecodings(s,0,dp);
    }
}
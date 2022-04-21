class Solution {
    int mod = (int)1e9 + 7;
     public long numDecodings02_memo(String str, int idx, long[] dp) {
        int n = str.length();
        if (idx == n) {
            return dp[idx] = 1;
        }

        if (dp[idx] != -1)
            return dp[idx];

        char ch = str.charAt(idx);
        if (ch == '0')
            return dp[idx] = 0;

        long count = 0;
        if (ch == '*') {
            count = (count + 9 * numDecodings02_memo(str, idx + 1, dp)) % mod;
            if (idx < n - 1) {
                char ch1 = str.charAt(idx + 1);
                if (ch1 >= '0' && ch1 <= '6')
                    count = (count + 2 * numDecodings02_memo(str, idx + 2, dp)) % mod;
                else if (ch1 >= '7' && ch1 <= '9')
                    count = (count + 1 * numDecodings02_memo(str, idx + 2, dp)) % mod;
                else
                    count = (count + 15 * numDecodings02_memo(str, idx + 2, dp)) % mod;
            }
        } else {
            count += 1 * numDecodings02_memo(str, idx + 1, dp) % mod;
            if (idx < n - 1) {
                char ch1 = str.charAt(idx + 1);
                if (ch1 == '*' && ch == '1')
                    count = (count + 9 * numDecodings02_memo(str, idx + 2, dp)) % mod;
                else if (ch1 == '*' && ch == '2')
                    count = (count + 6 * numDecodings02_memo(str, idx + 2, dp)) % mod;
                else if (ch1 != '*') {
                    int num = (ch - '0') * 10 + (ch1 - '0');
                    if (num <= 26)
                        count = (count + 1 * numDecodings02_memo(str, idx + 2, dp)) % mod;
                }
            }
        }

        return dp[idx] = count;
    }
    public int numDecodings(String s) {
        int n = s.length();
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        long ans = numDecodings02_memo(s,0,dp);
        return (int)ans;
    }
}
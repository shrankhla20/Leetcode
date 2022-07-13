class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length <= 1)return nums.length;
        int omax = 0;
        int[] dp = new int[nums.length];
        for(int i =0; i< nums.length; i++){
            int max = 0;
            for(int j =0; j < i; j++){
                if(nums[j] < nums[i])max = Math.max(dp[j],max);
            }
            dp[i] = max+1;
            omax = Math.max(omax,dp[i]);
        }
        return omax;
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1)return;
        int i = nums.length -2;
        while(i>= 0 && nums[i] >= nums[i+1])i--;
        if(i >= 0){
            int j = nums.length-1;
            while(j >= 0 && nums[j] <= nums[i])j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
    }
    public void reverse(int[] nums, int si , int ei){
        while(si <= ei){
            swap(nums,si,ei);
            si++;
            ei--;
        }
    }
    public void swap(int[] nums, int si, int ei){
        int temp = nums[si];
        nums[si] = nums[ei];
        nums[ei] = temp;
    }
}
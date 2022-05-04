class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int si = 0;
        int ei = nums.length-1;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2 == 0){
                arr[si] = nums[i];
                si++;
            }else{
                arr[ei] = nums[i];
                ei--;
            }
        }
        return arr;
    }
}
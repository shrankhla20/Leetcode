class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int si = -1;
        int ei = -1;
        for(int i = 0; i< nums.length; i++){
            if(arr[i] != nums[i]){
                if(si == -1)si = i;
                ei = i;
            }
        }
        return (si == -1 && ei == -1) ? 0 : ei-si+1;
    }
}
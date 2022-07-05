class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int idx = map.get(nums[i]);
                int diff = Math.abs(i-idx);
                if(diff <= k)return true;
                else map.put(nums[i],i);
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
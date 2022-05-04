class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                count++;
                if(map.get(nums[i]) == 1)map.remove(nums[i]);
                else map.put(nums[i],map.get(nums[i])-1);
            }else{
                map.put(k-nums[i],map.getOrDefault(k-nums[i],0)+1);
            }
        }
        return count;
    }
}
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> smallAns = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(0,nums);
        return res;
    }
    
    public void subset(int idx, int[] nums){
            List<Integer> base = new ArrayList<>(smallAns);
            res.add(base);
        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i-1])continue;
            smallAns.add(nums[i]);
            subset(i+1,nums);
            smallAns.remove(smallAns.size()-1);
        }
            
            
    }
}
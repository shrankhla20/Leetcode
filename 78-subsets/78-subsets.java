class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> smallAns = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subset(0,nums);
        return res;
    }
    
    public void subset(int idx, int[] nums ){
        if(idx == nums.length){
            List<Integer> base = new ArrayList<>(smallAns);
            res.add(base);
            return;
        }
        
        smallAns.add(nums[idx]);
        subset(idx+1,nums);
        smallAns.remove(smallAns.size() -1);
        subset(idx+1,nums);
    }
}
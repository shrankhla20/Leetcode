class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> smallAns = new ArrayList<>(); 
    public List<List<Integer>> permute(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        permute(nums,vis,0);
        return res;
    }
     public void permute(int[] nums, boolean[] vis, int count){
         if(count == nums.length){
             res.add(new ArrayList<>(smallAns));
             return;
         }
         for(int i = 0; i< nums.length; i++){
             if(!vis[i]){
                 vis[i] = true;
                 smallAns.add(nums[i]);
                 permute(nums, vis, count+1);
                 smallAns.remove(smallAns.size() -1);
                 vis[i] = false;
             }
         }
     }
}
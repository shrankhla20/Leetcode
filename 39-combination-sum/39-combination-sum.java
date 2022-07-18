class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> smallAns = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinationSum(0,candidates,target);
        return res;
    }
    public void combinationSum(int idx, int[] arr, int target){
        if(idx >= arr.length || target == 0){
            if(target == 0){
                List<Integer> base = new ArrayList<>(smallAns);
                res.add(base);
            }
            return;
        }
        
        if(target - arr[idx] >= 0){
            smallAns.add(arr[idx]);
            combinationSum(idx,arr,target-arr[idx]);
            smallAns.remove(smallAns.size()-1);
        }
        combinationSum(idx+1, arr, target);
    }
}
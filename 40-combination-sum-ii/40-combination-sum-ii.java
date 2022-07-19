class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> smallAns = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum(0,candidates,target);
        
        return res;
    }
    public void combinationSum(int idx, int[] arr, int target){
        if(target == 0){
            List<Integer> base = new ArrayList<>(smallAns);
            res.add(base);
            return;
        }
        
        for(int i = idx; i<arr.length; i++){
            if(i > idx && arr[i] == arr[i-1])continue;
            if(arr[i] > target)break;
            
            smallAns.add(arr[i]);
            combinationSum(i+1,arr,target-arr[i]);
            smallAns.remove(smallAns.size()-1);
        }    
        
    }
}
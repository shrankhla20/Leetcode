class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums1)map.put(ele,1);
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : nums2){
            if(! map.containsKey(ele))continue;
            list.add(ele);
            map.remove(ele);
            
        }
        int[] arr = new int[list.size()];
        for(int i =0; i<list.size() ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
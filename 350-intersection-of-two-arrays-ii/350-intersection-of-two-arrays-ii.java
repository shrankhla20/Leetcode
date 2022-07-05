class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums1)map.put(ele,map.getOrDefault(ele,0)+1);
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : nums2){
            if(! map.containsKey(ele))continue;
            list.add(ele);
            if(map.get(ele) <= 1)map.remove(ele);
            else map.put(ele, (map.get(ele)-1));
        }
        int[] arr = new int[list.size()];
        for(int i =0; i<list.size() ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
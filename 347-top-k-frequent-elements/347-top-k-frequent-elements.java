class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums)map.put(ele,map.getOrDefault(ele,0)+1);
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());
        
        ArrayList<Integer> list = new ArrayList<>();
        while(k-- > 0){
            list.add(maxHeap.remove());
        }
        int[] arr = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
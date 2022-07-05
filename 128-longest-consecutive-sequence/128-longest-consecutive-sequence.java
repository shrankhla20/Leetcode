class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums)map.put(ele,1);
        int len = 0;
        for(int ele: nums){
            if(! map.containsKey(ele))continue;
            int prev = ele-1;
            int next = ele+1;
            while(map.containsKey(prev)){
                map.remove(prev);
                prev--;
            }
            while(map.containsKey(next)){
                map.remove(next);
                next++;
            }
            len = Math.max(len,(next-prev-1));
            
        }
        return len;
    }
}
class FreqStack {
    
    private ArrayList<ArrayDeque<Integer>> freqMap;
    private HashMap<Integer,Integer> map;
    private int maxFreq = 0;

    public FreqStack() {
        freqMap = new ArrayList<>();
        map = new HashMap<>();
        
        freqMap.add(new ArrayDeque<>());
    }
    
    public void push(int val) {
        map.put(val, map.getOrDefault(val,0) +1);
        maxFreq = Math.max(maxFreq, map.get(val));
        
        if(maxFreq == freqMap.size())
            freqMap.add(new ArrayDeque<>());
        
        freqMap.get(map.get(val)).addFirst(val);
    }
    
    public int pop() {
        int rv = freqMap.get(maxFreq).removeFirst();
        if(freqMap.get(maxFreq).size() == 0){
            freqMap.remove(maxFreq--);
        }
        map.put(rv, map.get(rv) -1);
        if(map.get(rv) == 0)
            map.remove(rv);
        return rv;
    }
    
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
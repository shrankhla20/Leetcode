class FreqStack {
    
    private class pair implements Comparable<pair>{
        int val = 0;
        int idx = 0;
        int freq = 0;
        
        pair(int val, int idx, int freq){
            this.val = val;
            this.idx = idx;
            this.freq = freq;
        }
        
        public int compareTo(pair o){
            if(this.freq == o.freq)return o.idx - this.idx;
            else return o.freq-this.freq;       
        }
    }
    private PriorityQueue<pair> pq;
    private HashMap<Integer,Integer> freq;
    private int idx = 0;

    public FreqStack() {
        pq = new PriorityQueue<>();
        freq = new HashMap<>();
    }
    
    public void push(int val) {
        freq.put(val, freq.getOrDefault(val,0) +1);
        pq.add(new pair(val,idx++, freq.get(val)));
    }
    
    public int pop() {
        pair rp = pq.remove();
        freq.put(rp.val,rp.freq-1);
        if(freq.get(rp.val) == 0)
            freq.remove(rp.val);
        return rp.val;
    }
    
    public int top(){
        pair rp = pq.peek();
        return rp.val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
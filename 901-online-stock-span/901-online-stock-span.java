class StockSpanner {
    int day = 0;
    LinkedList<int[]> st = new LinkedList<>();
    public StockSpanner() {
        //{idx,value}
        st.addFirst(new int[]{-1,-1});
    }
    
    public int next(int price) {
        while(st.getFirst()[0] != -1 && st.getFirst()[1] <= price)
            st.removeFirst();
        int span = day - st.getFirst()[0];
        st.addFirst(new int[]{day++, price});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
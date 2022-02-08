class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        LinkedList<Integer> st = new LinkedList<>();
        int n = pushed.length;
        int idx =0;
        for(int ele: pushed){
            st.addFirst(ele);
            while(st.size() != 0 && st.getFirst() == popped[idx]){
                idx++;
                st.removeFirst();
            }
        }
        return idx == n;
        
    }
}
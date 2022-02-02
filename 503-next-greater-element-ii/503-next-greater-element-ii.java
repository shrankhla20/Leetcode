class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        LinkedList<Integer> st = new LinkedList<>();
        st.addFirst(-1);
        
        for(int i=0; i<2*n;i++){
            while(st.getFirst() != -1 && arr[st.getFirst()] < arr[i%n])
                ans[st.removeFirst()] = arr[i%n];
            
            if(i < n)st.addFirst(i);
        }
        return ans;
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) { //7n
        int n = heights.length, maxArea = 0;
        LinkedList<Integer> st = new LinkedList<>();
        st.addFirst(-1);
        
        for(int i=0; i<n; i++){
            while(st.getFirst() != -1 && heights[st.getFirst()] >= heights[i]){
                int h = heights[st.removeFirst()];
                int w = i - st.getFirst() -1;
                maxArea = Math.max(maxArea, h*w);
            }
            st.addFirst(i);
        }
        while(st.getFirst() != -1){
            int h = heights[st.removeFirst()];
            int w = n - st.getFirst() -1;
            maxArea = Math.max(maxArea, h*w);
        }
        return maxArea;
    }
}
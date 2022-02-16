class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0)return 0;
        int n = matrix.length, m = matrix[0].length;
        int[] height = new int[m];
        int maxArea = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j < m; j++){
                height[j] = matrix[i][j] == '0' ? 0 : height[j] +1;
            }
           maxArea = Math.max(maxArea, largestRectangleArea(height)); 
        }
        return maxArea;
        
    }
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
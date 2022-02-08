class Solution {
    public int scoreOfParentheses(String s) {
        LinkedList<Integer> st = new LinkedList<>();
        st.addFirst(0);
        
        for(int i =0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == '(')st.addFirst(0);
            else{
                int a = st.removeFirst();
                int b = st.removeFirst();
                
                int val = b + Math.max(2*a, 1);
                st.addFirst(val);
            }
        }
        return st.removeFirst();
    }
}
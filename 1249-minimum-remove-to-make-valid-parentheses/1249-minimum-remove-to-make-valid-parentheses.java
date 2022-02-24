class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        LinkedList<Integer> st = new LinkedList<>();
        char[] chArr = s.toCharArray();
        
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(st.size() != 0)st.removeFirst();
                else chArr[i] = '#';
            }else if(ch == '(')
                st.addFirst(i);
        }
        while(st.size() != 0)
            chArr[st.removeFirst()] = '#';
        
        StringBuilder sb = new StringBuilder();
        for(int  i=0; i<n; i++ ){
            if(chArr[i] != '#')sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}
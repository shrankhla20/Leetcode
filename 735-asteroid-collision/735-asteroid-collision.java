class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        for(int ele : arr){
            if(ele>0){
                st.addFirst(ele);
                continue;
            }
            while(st.size() != 0 && st.getFirst() > 0 && st.getFirst() < -ele)
                //not written equal to because then we don't we have to destroy the incoming element or not
                st.removeFirst();
            if(st.size() != 0 && st.getFirst() == -ele)
                st.removeFirst();
            else if(st.size() == 0 || st.getFirst() < 0)
                st.addFirst(ele);
            else{
                
            }
        }
        int[] ans = new int[st.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = st.removeFirst();
        }
        return ans;
    }
}
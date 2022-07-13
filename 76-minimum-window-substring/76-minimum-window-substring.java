class Solution {
    public String minWindow(String s, String t) {
        int si = 0, ei = 0, ns = s.length(), nt = t.length();
        int[] freq = new int[128];
        for(int i =0; i<nt; i++)freq[t.charAt(i)]++;
        int req = nt;
        int len = (int)1e5;
        int head = 0;
        while(ei < ns){
            if(freq[s.charAt(ei++)]-- > 0)req--;
            while(req == 0){
                if(ei - si < len)len = (ei - (head = si));
                if(freq[s.charAt(si++)]++ == 0)req++;
            }
        }
        return len == (int)1e5 ? "" : s.substring(head,head+len);
    }
}
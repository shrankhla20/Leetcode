class Solution {
    public int numDecodings(String s){
        int a = 1, b = 0;
        for(int idx = s.length()-1; idx >= 0; idx--){
            int sum = 0;
            char ch = s.charAt(idx);
            if(ch != '0'){
                
                sum = a;
        
                if(idx < s.length() -1){
                    char ch1 = s.charAt(idx +1);
                    int num = (ch - '0')*10 + (ch1-'0');
                    if(num <= 26)
                        sum += b;
                }
            }
            b = a;
            a = sum;
        }
        return a;
    }
    
   
}
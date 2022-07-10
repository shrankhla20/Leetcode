class Solution {
    private boolean[][] invalid;
    private char[] c1;
    private char[] c2;
    private char[] c3;
    
    public boolean isInterleave(String s1, String s2, String s3) {
        c1 = s1.toCharArray();
        c2 = s2.toCharArray();
        c3 = s3.toCharArray();
        
        int m = s1.length(),n=s2.length();
        
        if(m+n != s3.length())
            return false;
        
        invalid = new boolean[m+1][n+1];
        
        return dfs(0,0,0);
    }
    
    public boolean dfs(int i, int j, int k){
        if(invalid[i][j])
            return false;
        
        if(k == c3.length)
            return true;
        
        boolean valid = 
            i<c1.length && c1[i] == c3[k] && dfs(i+1,j,k+1) || 
            j<c2.length && c2[j] == c3[k] && dfs(i,j+1,k+1);
        
        if(!valid)
            invalid[i][j] = true;
        
        return valid;
    }
}
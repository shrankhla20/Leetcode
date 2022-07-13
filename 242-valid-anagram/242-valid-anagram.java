class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i<s.length() ; i++)frequencyMap.put(s.charAt(i),frequencyMap.getOrDefault(s.charAt(i),0)+1);
        
        for(int i=0; i< t.length(); i++){
            if(frequencyMap.containsKey(t.charAt(i))){
                frequencyMap.put(t.charAt(i),frequencyMap.get(t.charAt(i))-1);
                if(frequencyMap.get(t.charAt(i)) == 0)frequencyMap.remove(t.charAt(i));
            }else{
                return false;
            }
        }
        if(frequencyMap.size() == 0)return true;
            else return false;
    }
}
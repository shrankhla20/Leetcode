class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] ca = new char[26];
            for(char c: str.toCharArray())ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if(!map.containsKey(keyStr))map.put(keyStr,new ArrayList<>());
            map.get(keyStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(char c: t.toCharArray()){
            int counter = map.getOrDefault(c, 0);
            if(counter == 0){
                return false;
            }
            if(counter == 1){
                map.remove(c);
            }
            map.put(c, counter-1);
        }
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if(e.getValue() != 0) return false;
        }
        return true;
    }
}

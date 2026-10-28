class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String hash = getHash(strs[i]);
            if(map.containsKey(hash)){
                map.get(hash).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(hash, list);
            }
        }
        return map.entrySet().stream().map(s -> s.getValue()).toList();
    }
    public String getHash(String s){
        int[] chars = new int[26];
        for(char c: s.toCharArray()){
            chars[c - 'a'] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i: chars){
            sb.append(String.valueOf(i));
            sb.append("#");
        }
        return sb.toString();
    }
}

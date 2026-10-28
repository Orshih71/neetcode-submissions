class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length());
            sb.append('¦');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        int prev = 0;
        int len = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '¦') {
                len = Integer.parseInt(str.substring(prev, i));
                list.add(str.substring(i + 1, i + len + 1));
                prev = i + len + 1;
                len = 0;
                i += len + 1;
            }
        }
        return list;
    }
}

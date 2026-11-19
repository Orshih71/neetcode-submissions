class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            switch(c){
                case '(', '[', '{' -> stack.push(c);
                case ')' -> {
                    if(stack.isEmpty()) return false;
                    char par = stack.pop();
                    if('(' != par) return false;
                }
                case ']' -> {
                    if(stack.isEmpty()) return false;
                    char par = stack.pop();
                    if('[' != par) return false;
                }
                case '}' -> {
                    if(stack.isEmpty()) return false;
                    char par = stack.pop();
                    if('{' != par) return false;
                }
                default -> {return false;}
            }
        }
        return stack.isEmpty();
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(c);
        }

        str = sb.toString();

        int n = str.length();
        int i = 0; 
        int j = n - 1;
        int lb, rb;
        lb = n/2;
        if(n % 2 == 0) {
            rb = n/2;
        }
        else {
            rb = n/2 + 1;
        }

        while(i <= lb && j >= rb){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(str.charAt(j))){
                j--;
                continue;
            }
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }

        return true;

    }
}

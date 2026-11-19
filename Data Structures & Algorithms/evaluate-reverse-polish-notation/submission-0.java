class Solution {


    private boolean isExpression(String token){
        if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
            return true;
        }
        return false;
    }

    public int evalRPN(String[] tokens) {
        
        int n = tokens.length;
        if(n == 1) return Integer.valueOf(tokens[0]);
        Stack<Integer> nums = new Stack<>();
        int num1, num2;
        for(int i = 0; i < n; i++){
            switch(tokens[i]){
                case "+": 
                    num1 = nums.pop();
                    num2 = nums.pop();
                    nums.push(num1 + num2);
                    break;
                case "-": 
                    num1 = nums.pop();
                    num2 = nums.pop();
                    nums.push(num2 - num1);
                    break;
                case "*":
                    num1 = nums.pop();
                    num2 = nums.pop();
                    nums.push(num1 * num2);
                    break;
                case "/":
                    num1 = nums.pop();
                    num2 = nums.pop();
                    nums.push(num2 / num1);
                    break;
                default: 
                    nums.push(Integer.valueOf(tokens[i]));
                    break;

            }
        }
        return nums.peek();
    }
}

class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;
    public MinStack() {
       stack = new Stack<>(); 
    }
    
    public void push(int val) {
        stack.push(val);
        min = Math.min(min, val);
    }
    
    public void pop() {
        int curr = stack.pop();
        if(curr == min){
            min = Integer.MAX_VALUE;
            List<Integer> values = new ArrayList<>(stack);
            for(int val: values){
                min = Math.min(min, val);
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

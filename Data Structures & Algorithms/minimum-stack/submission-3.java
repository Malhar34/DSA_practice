class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        int top;
        if (minStack.isEmpty()) {
            top = val;
        } else {
            top = Math.min(val, minStack.peek());
        }
        minStack.push(top);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

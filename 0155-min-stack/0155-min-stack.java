class MinStack {
    Stack<Integer> main;
    Stack<Integer> minStack;

    public MinStack() {
        main = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        main.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }        
    }
    
    public void pop() {
        int val = main.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }        
    }
    
    public int top() {
        return main.peek();        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
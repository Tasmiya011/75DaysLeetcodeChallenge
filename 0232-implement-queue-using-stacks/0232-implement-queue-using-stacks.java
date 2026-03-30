import java.util.Stack;

class MyQueue {
    Stack<Integer> s1; // input stack
    Stack<Integer> s2; // output stack

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Always push to s1
    public void push(int x) {
        s1.push(x);
    }

    // Transfer from s1 to s2 only when s2 is empty
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Queue is empty only when both stacks are empty
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
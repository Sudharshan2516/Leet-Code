public class MyStack {
    private Queue<Integer> S;
    public MyStack() {
        S = new LinkedList<>();
    }
    
    public void push(int x) {
        S.add(x);
        for(int i = 1; i < S.size(); i++){
            S.add(S.poll());
        }
        
    }
    
    public int pop() {
        int n = S.peek();
        S.poll();
        return n;
    }
    
    public int top() {
        return S.peek();
    }
    
    public boolean empty() {
        return S.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
class MyStack {
    Queue<Integer> que;
    int n;

    public MyStack() {
        que = new ArrayDeque<>();
        n = 0;
    }
    
    public void push(int x) {
        que.offer(x);

        for(int i = 0; i < n; i++){
            que.offer(que.poll());
        }

        n++;
    }
    
    public int pop() {
        n--;
        return que.poll();
    }
    
    public int top() {
        return que.peek();
    }
    
    public boolean empty() {
        return que.isEmpty();
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

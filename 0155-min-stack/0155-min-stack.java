class MinStack {
    Stack<Element> stack;
    public static int min;
    public static int sameMinCount;

    public static class Element {
        public int value;
        public int lastMin;
        // public boolean result = true;

        public Element(int v) {
            value = v;
            lastMin = min;
            // result = v<m;
        }
    }

    public MinStack() {
        min = 0;
        stack = new Stack();
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            min = val;
        }
        stack.push(new Element(val));
        if(val < min) {
            min = val;
        } 
    }
    
    public void pop() {
        Element pop = stack.pop();
        int i = pop.value;
        if(pop.value == min) {
            min=pop.lastMin;
        } else {

        }
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return min;
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
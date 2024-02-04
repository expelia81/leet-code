class Solution {
    
    Stack<Integer> stackA = new Stack<>();
    Stack<Integer> stackB = new Stack<>();
    public String addBinary(String a, String b) {
        push(stackA, a);
        push(stackB, b);
        
        return summary();
    }
    
    public void push(Stack<Integer> stack, String s) {
        
        String[] arr = s.split("");
        
        for(String temp : arr) {
            Integer i = Integer.valueOf(temp);
            stack.push(i);
        }
    }
    
    public String summary(){
        
        int temp = 0;
        String s = "";
        
        while(!stackA.isEmpty() || !stackB.isEmpty()) {
            int a = 0;
            int b = 0;
            if(!stackA.isEmpty()) {
                a = stackA.pop();    
            }
            if(!stackB.isEmpty()) {
                b = stackB.pop();
            }
            
            int result = a+b+temp;
            temp = 0;
            if(result >=2) {
                temp = 1;
                result -= 2;
            }
            s = result+s;
        }
        if(temp==1) s = temp+s;
        return s;
    }
}
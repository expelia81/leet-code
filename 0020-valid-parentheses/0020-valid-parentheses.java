

class Solution {
    public boolean isValid(String s) {
        String[] arr = s.split("");

        Stack<String> stack = new Stack();

        for(String ch : arr) {
            if(stack.isEmpty()) {
                stack.push(ch);
            } else {
                String pop = stack.pop();
				switch (pop) {
					case "(":
						if(!ch.equals(")")) {
							stack.push(pop);
							stack.push(ch);
						}
						break;
					case "{":
						if(!ch.equals("}")) {
							stack.push(pop);
							stack.push(ch);
						}
						break;
					case "[":
						if(!ch.equals("]")) {
							stack.push(pop);
							stack.push(ch);
						}
						break;
                    default :
                        stack.push(pop);
                        stack.push(ch);
				}
            }
        }

        return stack.isEmpty();
    }
}
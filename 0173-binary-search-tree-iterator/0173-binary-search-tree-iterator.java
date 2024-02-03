/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    
    Queue<Integer> stack = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        push(root);
    }
    
    public int next() { //순차적으로 데이터를 꺼내야한다.
        return stack.poll();
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    
    // tree를 순회하며 작은 값부터 넣어야하는데... 어케넣노!!!!!!
    void push(TreeNode input) {
        
        if(input.left != null) {
            push(input.left);
        }
        
        stack.add(input.val);
        
        if(input.right != null) {
            push(input.right);
        }
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
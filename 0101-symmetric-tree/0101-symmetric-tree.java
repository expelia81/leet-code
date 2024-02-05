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
class Solution {
    Stack<Integer> a = new Stack<>();
    Stack<Integer> b = new Stack<>();
    public boolean isSymmetric(TreeNode root) {
        
//         TreeNode left = root.left;
//         TreeNode right = root.right;
        
//         findLeftTree(left, a);
        
//         findRightTree(right, b);
        
//         return isSame();
        
        return isSame(root.left, root.right);
        
    }
    
    
    
    // 깊이가 다른 경우엔 어떡하지
    boolean isSame(TreeNode left, TreeNode right) {
        if(left == null && right ==null) {
            return true;
        }
        if(left != null && right != null) {
            return left.val == right.val && isSame(left.right, right.left) && isSame(left.left, right.right);
        }
        return false;
    }
    
    void findLeftTree(TreeNode root, Stack<Integer> stack) {
        
        
        if(root.left != null) {
            findLeftTree(root.left, stack);
        }
        stack.push(root.val);
        if(root.right != null) {
            findLeftTree(root.right, stack);
        }
    }
    void findRightTree(TreeNode root, Stack<Integer> stack) {
        
        
        if(root.right != null) {
            findRightTree(root.right, stack);
        }
        
        stack.push(root.val);
        if(root.left != null) {
            findRightTree(root.left, stack);
        }
    }
}
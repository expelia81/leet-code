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
        return isSame(root.left, root.right);
        
    }
    
    
    boolean isSame(TreeNode left, TreeNode right) {
        if(left == null && right ==null) {
            return true;
        }
        if(left != null && right != null) {
            return left.val == right.val && isSame(left.right, right.left) && isSame(left.left, right.right);
        }
        return false;
    }
    
}
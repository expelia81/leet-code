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
    int val = 0;
    TreeNode result = null;
    public TreeNode searchBST(TreeNode root, int inputValue) {
        val = inputValue;
        
        return findTree(root);
    }
    
    TreeNode findTree(TreeNode input) {
        System.out.println(input.val);
        
        if(input.val == val) {
            return input;
        } else if(input.val> val && input.left != null) {
            return findTree(input.left);
        } else if(input.val< val && input.right != null) {
            return findTree(input.right);
        } else {
            return null;
        }
    }
}
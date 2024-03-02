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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return sum(root, targetSum,0);
    }
    
    
    public boolean sum(TreeNode node, int targetSum, int sum) {
        sum = sum + node.val;
        if(sum==targetSum && node.left==null && node.right==null) return true;
        
        // if(sum>targetSum) return false;
        
        
        boolean result = false;
        if(node.left != null) {
            result = result || sum(node.left, targetSum, sum);
        }
        
        if(node.right != null) {
            result = result || sum(node.right, targetSum, sum);
        }
        
        return result;
    }
}
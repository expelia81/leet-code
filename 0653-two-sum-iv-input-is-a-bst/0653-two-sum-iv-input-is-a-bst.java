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
    Set<Integer> set = null;
    boolean result = false;
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();
        
        registerValues(root, k);
        
        return result;
    }
    
    void registerValues(TreeNode node, int k) {
        if(node != null) {
            int target = k - node.val;
            if(set.contains(target)) result = true;
            set.add(node.val);
            registerValues(node.left, k);
            registerValues(node.right, k);
        }
    }
}
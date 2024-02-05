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
    
    int max = 1;
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        
        // 양쪽 노드 모두가 null일 때 재귀가 멈추면 된다.
        findTree(root, 1);
        
        return max;
    }
    
    
    void findTree(TreeNode node, int now) {
        
        System.out.println("max : " + now);
        if(node.left==null && node.right==null) {
            return;
        }
        
        if(node.left!=null) {
            max = Math.max(max,now+1);
            findTree(node.left, now+1);
        }
        
        if(node.right!=null) {
            max = Math.max(max,now+1);
            findTree(node.right, now+1);
        }
        
        
    }
}
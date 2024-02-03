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
    
    // Queue<Integer> queue = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    
    public TreeNode balanceBST(TreeNode root) {
        findTrees(root);
        return createTree(0, list.size()-1);
    }
    
    public void findTrees(TreeNode input) {
        if(input.left != null) findTrees(input.left);
        System.out.println(input.val);
        // queue.add(input.val);
        list.add(input.val);
        if(input.right != null) findTrees(input.right);
    }
    
    public TreeNode createTree(int start, int end) {
        int mid = (start+end)/2;
        System.out.println("start : "+start+ " mid : " + mid + " end : " +end);
        if(start>end) {
            System.out.println("return null");
            return null;
        }
        TreeNode node = new TreeNode(list.get(mid));
        
        node.left = createTree(start, mid-1);
        
        node.right = createTree(mid+1, end);
            
            
        return node;
        
    }
    
}
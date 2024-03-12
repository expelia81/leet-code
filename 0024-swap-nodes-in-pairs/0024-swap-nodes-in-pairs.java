/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode result = head;
        
        ListNode left = head;
        ListNode right = head==null ? null : head.next;
        
        
        while(left!=null && right!=null) {
            int temp1 = left.val;
            int temp2 = right.val;
            
            left.val = temp2;
            right.val = temp1;
            
            left = right.next;
            right = left==null ? null : left.next;
        }
        
        
        
        return head;
    }
}
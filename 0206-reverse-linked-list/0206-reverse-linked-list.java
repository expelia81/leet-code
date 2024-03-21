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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        
        if(head==null) return null;
        
        while(head.next != null) {
            stack.push(head);
            head=head.next;
        }
        
        ListNode result = head;
        
        while(!stack.isEmpty()) {
            ListNode pre = stack.pop();
            // System.out.println(pre.val+"");
            pre.next = null;
            head.next = pre;
            head = pre;
        }
        
        return result;
    }
}
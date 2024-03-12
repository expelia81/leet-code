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
    public ListNode swapNodes(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        
        ListNode now = head;
        
        int i = 0;
        
        ListNode left = null;
        ListNode right = null;
        
        while(now != null) {
            i++;
            stack.push(now);
            if(i==k) {
                left = now;
            }
            now=now.next;
        }
        
        i=0;
        
        while(!stack.isEmpty()) {
            i++;
            ListNode now2 = stack.pop();
            if(i==k) {
                right = now2;
            }
        }
        
        int temp = left.val;
        
        left.val = right.val;
        
        right.val = temp;
        
        return head;
    }
}
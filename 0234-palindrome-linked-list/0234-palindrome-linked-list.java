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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        // Stack<Integer> stack = new Stack<>();
        
        while(head!=null) {
            // ListNode temp = head;
            list.add(head.val);
            // stack.push(head.val);
            
            head=head.next;
        }
        
        for(int i=0;i<list.size()/2+list.size()%2;i++) {
            int first = list.get(i);
            int second = list.get(list.size()-i-1);
            if(first != second) {
                return false;
            }
        }
        // for(int i : list ){
        //     if(i!=stack.pop()) {
        //         return false;
        //     }
        // }
        
        return true;
        
        
    }
}
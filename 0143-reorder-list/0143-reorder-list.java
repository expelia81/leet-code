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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        if(head.next == null) {
            return;
        }
        
        ListNode result = head;
        
        while(head!=null) {
            list.add(head.val);
            head = head.next;
        }
        
        ListNode temp = result;
        temp.next = new ListNode(list.get(list.size()-1));
        temp=temp.next;
        
        for(int i=1;i<list.size()/2+list.size()%2;i++) {
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
            
            if(list.size()-1-i != i) {
                temp.next=new ListNode(list.get(list.size()-1-i));
                temp=temp.next;   
            }
        }
        
        head = result;
    }
}
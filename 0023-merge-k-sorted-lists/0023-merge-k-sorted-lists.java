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
    List<Integer> list = new ArrayList<>();
    public ListNode mergeKLists(ListNode[] lists) {
        for(ListNode node : lists) {
            toList(node);
        }
        
        ListNode result = new ListNode();
        ListNode temp = result;
        
        list = list.stream()
            .sorted()
            .toList();
        
        
        for(int i : list) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        
        
        return result.next;
    }
    
    
    public void toList(ListNode head) {
        while(head!=null) {
            list.add(head.val);
            head = head.next;
        }
    }
}
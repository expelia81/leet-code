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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode root = null;
        
        while(list1 != null || list2!=null){
            
            int left = list1 == null ? 101 : list1.val;
            int right = list2 == null ? 101 : list2.val;
            
            if(left<=right) {
                if(root==null){
                    root=new ListNode(list1.val);    
                    result.next=root;
                } else {
                    root.next=new ListNode(list1.val);
                    root=root.next;
                }
                
                list1=list1.next;
            } else {
                if(root==null){
                    root=new ListNode(list2.val);    
                    result.next=root;
                } else {
                    root.next=new ListNode(list2.val);
                    root=root.next;
                }
                list2=list2.next;
            }
        }
        
        return result.next;
    }
}
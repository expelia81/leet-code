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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        
        while(temp!=null){
            reverse(temp,k);
            for(int i=0;i<k;i++) {
                if(temp==null) break;
                temp=temp.next;
            };    
        }
        
        return head;
    }
    
    public void reverse(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();
        int index = 0;
        while(head!=null) {
            index++;
            if(index>k) break;
            list.add(head);
            head = head.next;
        }
        if(list.size() < k) return;
        
        // System.out.println("list : " + list.size());
        
        for(int i=1;i<=k;i++) {
            if(i==(k/2+1)) {
               break; 
            }
            // System.out.println("test");
            // System.out.println(list.get(i-1).val + " - " + list.get(k-i).val);
            
            int temp = list.get(i-1).val;
            
            
            list.get(i-1).val = list.get(k-i).val;
            list.get(k-i).val = temp;
        }
    }
}
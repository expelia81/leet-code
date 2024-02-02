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
    String s1 = "";
        
    String s2 = "";
    
    String val = "";
    int upNum = 0;
    
    ListNode result = null;
    ListNode next = null;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        getString(l1,l2);
        
        if(upNum==1) {
            next.next = new ListNode(1);
        }
        
        return result;
        
        
    }
    
    public void getString(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null) return;
        int val1 = l1==null? 0 : l1.val;
        int val2 = l2==null? 0 : l2.val;
        System.out.println("val 1 : " + val1);
        System.out.println("val 2 : " + val2);
        int temp = val1 + val2;
        if(upNum == 1) {
            upNum=0;
            temp+=1;
        }
        if(temp>=10) {
            temp -= 10;
            upNum = 1;
        }
        
        
        if(result == null) {
            result = new ListNode(temp);
            next = result;
        }
        else {
            ListNode test = new ListNode(temp);
            next.next = test;
            next = test;
        }
        
        getString(l1==null? null : l1.next, l2==null? null : l2.next);
    }
    
    public ListNode getValue1(ListNode node) {
        if(node==null) return null;
        System.out.println("node 1 : "+node.val);
        s1 = node.val+s1;
        return getValue1(node.next);
    }
    
    public ListNode getValue2(ListNode node) {
        if(node==null) return null;
        System.out.println("node 2 : "+node.val);
        s2 = node.val+s2;
        return getValue2(node.next);
    }
    
    public ListNode getValue(long value) {
        String s = ""+value;
        ListNode pre = null;
        for(String temp : s.split("")) {
            Integer i = Integer.valueOf(temp);
            
            if(pre==null) {
                pre = new ListNode(i);
            } else {
                ListNode now = new ListNode(i,pre);
                pre = now;
            }
        }
        return pre;
    }
}
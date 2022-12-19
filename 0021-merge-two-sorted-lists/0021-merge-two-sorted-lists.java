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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        
        ListNode root=dummy;
        
        while(l1!=null && l2!=null){
            ListNode node;
            if(l1.val<=l2.val){
                node=new ListNode(l1.val);
                root.next=node;
                root=root.next;
                l1=l1.next;
            }else{
                node=new ListNode(l2.val);
                root.next=node;
                root=root.next;
                l2=l2.next;
            }
        }
        while(l1!=null){
            ListNode node=new ListNode(l1.val);
            root.next=node;
            root=root.next;
            l1=l1.next;
        }
        while(l2!=null){
            ListNode node=new ListNode(l2.val);
            root.next=node;
            root=root.next;
            l2=l2.next;
        }
        return dummy.next;
    }
}
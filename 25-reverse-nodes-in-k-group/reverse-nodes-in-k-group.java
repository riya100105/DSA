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
        if(head==null || k==1) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode grouprev=dummy;
        while(true){
            ListNode kth=kthNode(grouprev,k);
            if(kth==null) break;
        ListNode groupnext=kth.next;
        ListNode prev=groupnext;
        ListNode curr=grouprev.next;
        while(curr!=groupnext){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode next=grouprev.next;
        grouprev.next=kth;
        grouprev=next;
        }
        return dummy.next;
    }
    private ListNode kthNode(ListNode curr,int k){
        while(curr!=null && k>0){
            curr=curr.next;
            k--;
        }
        return curr;
    }
}
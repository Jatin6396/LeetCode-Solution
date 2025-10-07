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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;

        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }

        
        
        cnt=cnt-n;
        if(cnt==0){
             temp=head;
            head=head.next;
            temp.next=null;
            return head;
        }

        ListNode prev=null;
        temp=head;

        while(cnt-->0){
            prev=temp;
            temp=temp.next;

        }
        
        prev.next=temp.next;
        return head;
        
    }
}
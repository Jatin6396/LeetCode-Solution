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
       ListNode f=head;
       ListNode s=head;
       while(n>0 && s!=null){
        n--;
        s=s.next;
       }
       if(n!=0) return head;
       if(s==null){
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return head;
        }
        ListNode prev=null;

        while(s!=null){
            s=s.next;
            prev=f;
            
            f=f.next;

        }
        prev.next=f.next;
        f.next=null;
        return head;
    }
}
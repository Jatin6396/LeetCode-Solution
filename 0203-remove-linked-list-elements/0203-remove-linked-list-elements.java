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
    public ListNode removeElements(ListNode head, int val) {
       while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null ){
            prev=curr;
            curr=curr.next;
            if(curr!=null && curr.val==val ){
                System.out.println(1);
                prev.next=curr.next;
                prev=curr.next;

            }

        }

        return head;
        
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow=head;
        ListNode prev=null;
        while(slow.next!=null){
            prev=slow;
             slow=slow.next;
            if(prev.val==slow.val){
                prev.next=slow.next;
                 slow = prev;
            }
          
        }
        return head;
    }
}
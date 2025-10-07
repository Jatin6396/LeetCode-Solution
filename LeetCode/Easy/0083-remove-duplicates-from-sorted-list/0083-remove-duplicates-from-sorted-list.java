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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode deleteDuplicates(ListNode head) {
    LinkedHashSet<Integer> hs=new LinkedHashSet<>();
     ListNode temp=head;
     while(temp!=null){
        hs.add(temp.val);
        temp=temp.next;
     }
     temp=new ListNode(-1);
     ListNode tail=temp;

     for (int val : hs) {  
    tail.next = new ListNode(val); 
    tail = tail.next;             
     }

    // head=reverse(temp.next);
     return temp.next;
    
    }
}
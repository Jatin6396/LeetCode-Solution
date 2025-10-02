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
    public static ListNode getmiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;


    }
    public static ListNode merge(ListNode left,ListNode right){
        if(left==null) return right;
        if(right==null) return left;
        ListNode temp;
        if(left.val<=right.val){
            temp=left;
            temp.next=merge(left.next,right);
        }
        else{
            temp=right;
            temp.next=merge(left,right.next);
        }

        return temp;

    }
    public static ListNode mergeSort(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode middle=getmiddle(head);
        ListNode middlenext=middle.next;
        middle.next=null;
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(middlenext);

        return merge(left,right);

    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}
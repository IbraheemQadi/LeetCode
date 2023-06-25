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
// 203. Remove Linked List Elements
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy=new ListNode(0,head);
        ListNode left=dummy;
        ListNode right=head;

        while(right != null){
            ListNode next=right.next;
            
            if(right.val == val){
                left.next=next;
                right.next=null;
            }else
                left=right;

            right=next;

        }

        return dummy.next;

    }
}
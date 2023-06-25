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
// 19. Remove Nth Node From End of List
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null) return null;

        ListNode p=head;

        for(int i=0 ;i < n ; i++){
            if(p != null)
                p=p.next;
        }
        
        ListNode p2=head;
        ListNode p2left=null;

        while(p !=null){
            p=p.next;
            p2left=p2;
            p2=p2.next;
        }
        // now delete
        if(p2left == null){
            // delete from the start
            head=head.next;
            return head;
        }
        // delete from any location
        p2left.next=p2.next;
        p2.next=null;

        return head;

        
    }
}
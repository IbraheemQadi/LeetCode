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
// 206. Reverse Linked List
class Solution {
    public ListNode reverseList(ListNode head) {

    if(head == null) return head;

    ListNode curr=head;
    ListNode prev=null;
    ListNode currNext=null;

    while(curr !=null ){
        currNext=curr.next;
        curr.next=prev;
        prev=curr;
        curr=currNext;
    }


    return prev;



    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// 160. Intersection of Two Linked Lists
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;

        while(a != b){
            a = (a !=null) ? a.next : headB;  
            b = (b !=null) ? b.next : headA;  

            if(a == b) return a;
        }
        
        return null;

    }
}


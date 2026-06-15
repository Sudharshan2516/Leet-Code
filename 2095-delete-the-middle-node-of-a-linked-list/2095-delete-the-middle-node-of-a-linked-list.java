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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode Fast = head.next.next;
        while(Fast != null && Fast.next != null){
            slow = slow.next;
            Fast = Fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
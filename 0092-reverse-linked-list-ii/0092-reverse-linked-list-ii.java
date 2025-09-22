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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null ||  left == right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        int p =1;
        while(p < left){
            prev = prev.next;
            p++;
        }
        ListNode start = prev.next;
        ListNode curr = start.next;
        while(p<right){
            start.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = start.next;
            p++;
        }
        return dummy.next;
    }
}
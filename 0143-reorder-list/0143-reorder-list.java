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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find the middle
        ListNode slow = head;
        ListNode fa = head;
        while (fa != null && fa.next != null) {
            slow = slow.next;
            fa = fa.next.next;
        }

        // 2. Reverse second half
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // split the list

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // 3. Merge two halves
        ListNode first = head;
        ListNode second = prev; // head of reversed second half

        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}

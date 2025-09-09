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
    public ListNode reverseList(ListNode head) {
        /*if(head == null || head.next == null){
            return head;
        }
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
        */
    ListNode Crr = head;
    ListNode Pre = null;
    while(Crr != null){
        ListNode temp = Crr.next;
        Crr.next = Pre;
        Pre = Crr;
        Crr = temp;
    }
    return Pre;


    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       
        if(head == null || head.next == null){
            return false;
        }
        ListNode Slow = head;
        ListNode Fast = head.next;
        while(Fast != null && Fast.next!=  null){
            if(Slow == Fast) return true;
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        return false;

    }
}
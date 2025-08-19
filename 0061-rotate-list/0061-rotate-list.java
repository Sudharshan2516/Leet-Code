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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ){
            return head;
        }
        int c =1;
       ListNode cr = head;
       while(cr.next != null ){
        cr = cr.next;
        c++;
       }
       k = k%c;
       if(k ==0){
        return head;
       }
       cr.next = head;
       int re =c-k;
       ListNode newT = head;
       for(int i=1; i <re; i++){
        newT = newT.next;
       }
       ListNode nHead = newT.next;
       newT.next = null;
       return nHead;
       

    }
}
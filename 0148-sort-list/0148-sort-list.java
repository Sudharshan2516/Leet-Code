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
    public ListNode sortList(ListNode head) {
    List<Integer> Ar = new ArrayList();
    ListNode temp = head;
    while(temp != null){
        Ar.add(temp.val);
        temp = temp.next;
    }
    Collections.sort(Ar);
    temp = head;
    for(int val : Ar){
        temp.val = val;
        temp = temp.next;
    }
    return head;
    }
}
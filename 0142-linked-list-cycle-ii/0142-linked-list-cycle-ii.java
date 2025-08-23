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
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> Mp = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            if(Mp.containsKey(temp)){
                return temp;
            }
            Mp.put(temp, 1);
            temp = temp.next;
        }
        return null;
    }
}
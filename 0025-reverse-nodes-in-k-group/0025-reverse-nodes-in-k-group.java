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
        public ListNode reverseList(ListNode head){
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

    public ListNode getKthNode(ListNode temp, int k){
        k -= 1;
        while(temp != null && k >0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode PreL = null;
        while(temp != null){
            ListNode kNode = getKthNode(temp, k);
            if(kNode == null){
                if(PreL != null){
                    PreL.next = temp;
                }
                 break;
            }
            ListNode Nex = kNode.next;
            kNode.next = null;
            reverseList(temp);
            if(temp == head){
                head = kNode;
            }
            else{
                PreL.next = kNode;
            }
            PreL = temp;
            temp = Nex;
        }
        return head;
    }
}
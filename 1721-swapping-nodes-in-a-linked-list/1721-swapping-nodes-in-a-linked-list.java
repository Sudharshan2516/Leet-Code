class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode target = head;
        
        for (int i = 1; i < k; i++) {
            target = target.next;
        }

        ListNode fast = target;
        ListNode slow = head;

    
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

      
        int temp = target.val;
        target.val = slow.val;
        slow.val = temp;

        return head;
    }
}

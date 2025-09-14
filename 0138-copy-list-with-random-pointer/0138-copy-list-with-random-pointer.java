/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null ) return null;
        HashMap<Node, Node> Mp = new HashMap<>();
         Node temp = head;
        while(temp != null){
            Node curr = new Node(temp.val);
            Mp.put(temp, curr);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            Node Clone = Mp.get(temp);
            Clone.next = Mp.get(temp.next);
            Clone.random = Mp.get(temp.random);
            temp = temp.next;
        }
       return  Mp.get(head);
    }
}
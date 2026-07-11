/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

// RECURSIVE DFS APPROACH

class Solution {
    public Node flattening(Node curr){
        Node tail = curr;

        while(curr != null){
            if(curr.child != null){
                Node nextNode = curr.next;

                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;

                Node childTail = flattening(curr.next);

                childTail.next = nextNode;

                if(nextNode != null) nextNode.prev = childTail;

                curr = nextNode;
                tail = (curr != null) ? curr : childTail;
            }

            else{
                tail = curr;
                curr = curr.next;
            }
        }

        return tail;
    }
    public Node flatten(Node head) {
        flattening(head);
        return head;
    }
}

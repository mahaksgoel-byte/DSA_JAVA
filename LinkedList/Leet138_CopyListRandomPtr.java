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
        if(head == null) return null;
        
        Node newHead = null, temp = head;

        while(temp != null){
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        newHead = head.next;
        Node newTemp = newHead;

        temp = head;

        while(temp != null){
            if(temp.random != null)
                newTemp.random = temp.random.next;
            else 
                newTemp.random = temp.random;

            temp = temp.next.next;
            if(newTemp.next != null) newTemp = newTemp.next.next;
        }

        newTemp = newHead;
        temp = head;

        while(temp != null){
            temp.next = temp.next.next;
            temp = temp.next;

            if(newTemp.next != null) newTemp.next = newTemp.next.next;
            newTemp = newTemp.next;
        }

        return newHead;
    }
}

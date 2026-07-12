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
        ListNode prev = null, curr = head;

        while(curr != null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;

        ListNode first = head, last = head, nextNode = null, prevTail = null;

        while(first != null){
            last = first;
            
            for(int i = 0; i < k - 1; i++){
                if(last == null) return head;
                last = last.next;
            }

            if(last == null) return head;

            nextNode = last.next;

            last.next = null;

            ListNode newHead = reverseList(first);

            if(first == head){
                head = newHead;
            }
            else{
                prevTail.next = newHead;
            }

            prevTail = first;

            first.next = nextNode;
            first = nextNode;
        }

        return head;
    }
}

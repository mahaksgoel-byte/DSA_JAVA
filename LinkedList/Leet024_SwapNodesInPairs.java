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
    public void pairReverse(ListNode back, ListNode prev, ListNode curr, ListNode front){

        if(prev == null || curr == null) return;

        curr.next = prev;
        prev.next = front;
        back.next = curr;

        back = prev;
        prev = front;

        if(prev != null){
            curr = prev.next;
        }

        if(curr != null){
            front = curr.next;
        }

        pairReverse(back, prev, curr, front);
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1, head);
        ListNode back = dummy, prev = head, curr = head.next;

        pairReverse(back, prev, curr, curr.next);

        return dummy.next;
    }
}

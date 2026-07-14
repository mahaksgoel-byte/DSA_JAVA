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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy, fast = dummy;

        int i = 0, k = right - left;

        while(i < k){
            fast = fast.next;
            i++;
        }

        ListNode back = null;

        while(i < right){
            back = slow;
            slow = slow.next;
            fast = fast.next;

            i++;
        }

        ListNode forward = fast.next, prev = null, curr = slow;

        while(curr != forward){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        slow.next = forward;
        back.next = fast;

        return dummy.next;
    }
}

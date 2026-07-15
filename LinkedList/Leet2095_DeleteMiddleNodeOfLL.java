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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = head, fast = head, back = dummy;

        while(fast != null && fast.next != null){
            back = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        back.next = back.next.next;

        return dummy.next;
    }
}

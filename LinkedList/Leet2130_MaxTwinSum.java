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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null, curr = slow;

        while(curr != null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        ListNode newHead = prev, temp1 = head, temp2 = newHead;
        int maxSum = Integer.MIN_VALUE;

        while(temp2 != null){
            int sum = temp1.val + temp2.val;

            maxSum = Math.max(maxSum, sum);

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return maxSum;
    }
}

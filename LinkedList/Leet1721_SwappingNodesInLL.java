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

// SWAP VALUES (GIVEN IN QUESTION - question title misleading)

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        ListNode slow = head, fast = head;

        int i = 1;

      // Marking the kth node from start (creating space between slow and fast)
        while(i < k){
            fast = fast.next;
            i++;
        }

        ListNode start = fast;

      // slow must be k steps behind fast (kth node from end)
        while(fast != null && fast.next != null){ 
            fast = fast.next;
            slow = slow.next;
        }

        int temp = start.val;
        start.val = slow.val;
        slow.val = temp;

        return head;
    }
}

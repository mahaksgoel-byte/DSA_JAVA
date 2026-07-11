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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;

        ListNode temp = head;
        int count = 1;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        temp.next = head;

        k = k % count;
        k = count - k - 1;

        ListNode cut = head;

        for(int i = 0; i < k; i++){
            cut = cut.next;
        }

        ListNode newHead = cut.next;
        cut.next = null;

        return newHead;
    }
}

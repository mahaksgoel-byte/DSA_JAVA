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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode curr = head, front = head.next;

        while(front != null){
            if(curr.val == front.val) front = front.next;

            else{
                curr.next = front;
                curr = front;
                front = front.next;
            }
        }

        curr.next = front;

        return head;
    }
}

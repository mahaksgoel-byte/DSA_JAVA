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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);

        ListNode s = small, l = large, temp = head;

        while(temp!= null){
            if(temp.val < x){
                s.next = temp;
                s = s.next;
            }
            else{
                l.next = temp;
                l = l.next;
            }

            temp = temp.next;
        }

        l.next = null;
        s.next = large.next;
        return small.next;
    }
}

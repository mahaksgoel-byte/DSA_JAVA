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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = new int[2];

        result[0] = -1;
        result[1] = -1;

        ListNode prev = head, curr = prev.next;
        
        int first_critical = -1, prev_critical = -1;
        int count = 0, distance = 0, minDistance = Integer.MAX_VALUE;

        while(curr != null && curr.next != null){
            if((curr.val > prev.val && curr.val > curr.next.val) 
            || (curr.val < prev.val && curr.val < curr.next.val)){
                if(first_critical == -1){
                    first_critical = count;
                }

                else{
                    distance = count - prev_critical;
                }

                prev_critical = count;
                if(distance != 0 && minDistance > distance) minDistance = distance;
            }

            count++;
            prev = prev.next;
            curr = curr.next;
        }

        int maxDistance = prev_critical - first_critical;

        if(minDistance != Integer.MAX_VALUE){
            result[0] = minDistance;
            result[1] = maxDistance;
        }

        return result;
    }
}

// Here are two solutions to this problem
// <b>First approach</b> is the most optimal in terms of TC - O(n) and SC - O(1) (excluding output space)
class Solution {
    public ListNode reverseList(ListNode head){ //helper function to reverse the lists
        ListNode prev = null, curr = head, front = curr;

        while(curr != null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode head = null;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);

            if(head == null){
                head = newNode;
            }

            else{
                newNode.next = head;
                head = newNode;
            }
        }

        return head;
    }
}

// <b>Second approach</b> - follow up (compute without reversing) TC - O(n) and SC - O(n) 

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        ListNode temp1 = l1, temp2 = l2;

        while(temp1 != null){
            st1.push(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            st2.push(temp2.val);
            temp2 = temp2.next;
        }

        ListNode head = null;
        int carry = 0;

        while(!st1.isEmpty() || !st2.isEmpty() || carry != 0){
            int sum = carry;

            if(!st1.isEmpty()) sum += st1.pop();
            if(!st2.isEmpty()) sum += st2.pop();

            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);

            if(head == null){
                head = newNode;
            }

            else{
                newNode.next = head;
                head = newNode;
            }
        }

        return head;
    }
}

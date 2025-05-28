import java.util.*;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Check if the head is null
        if (head == null) {
            return null;
        }

        // Use a dummy node to handle edge cases
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                // Remove the current node
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        // Return the modified list (starting from dummy.next)
        return dummy.next;
    }
}
//you cannot do this with the normal process since in the test case of linked list [7,7,7,7] with value =7 u will stuck 
// see this question https://leetcode.com/problems/remove-linked-list-elements/submissions/1158249606/ 
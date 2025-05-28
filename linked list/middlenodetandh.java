class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class middlenodetandh {

    public static ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move slow pointer by one and fast pointer by two
        // When fast pointer reaches the end, slow pointer will be at the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Example usage:
        // Constructing a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // MiddleNodeFinder finder = new MiddleNodeFinder();
        ListNode middleNode = findMiddle(head);
        System.out.println("Middle node value: " + middleNode.val); // Output: 3
    }
}

public class reverse_node<ListNode> {

    class ListNode {
        int data;
        ListNode next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;

            // update
            prev = current;
            current = next;
        }
        return prev;
    }
}

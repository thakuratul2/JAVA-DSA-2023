public class remove_list_element<ListNode> {
class ListNode{
    int val;
    ListNode next;
}

    public ListNode removeElements(ListNode head, int val) {
        ListNode dumy = head;

        while(dumy!=null){
            if(head.val == val && dumy == head){
                head = head.next;
                dumy = head;
                continue;//skip the current value if found
            }
            if(dumy.next == null){
                break;
            }
            if(dumy.next.val == val){
                dumy.next = dumy.next.next;
                continue;// if the 2 node is val then skip again
            }
            dumy = dumy.next;
        }
        return head;
    }
}

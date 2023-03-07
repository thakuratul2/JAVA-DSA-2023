public class remove_duplicate {
    static ListNode head;
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        ListNode temp = head;

        if(temp == null){
            return; //return null
        }
        while(temp.next!=null){
         if(temp.val == temp.next.val){
             temp.next = temp.next.next;
         }else{
             temp = temp.next;
         }
        }
        return; // return head;
    }
}

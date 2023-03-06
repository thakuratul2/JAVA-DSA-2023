public class basic {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // add in first

    public void addFirst(int data) {
        Node new_node = new Node(data);
        if (head == null) {// if the node is empty
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }

    // add in last
    public void addLast(int data) {
        Node new_node2 = new Node(data);
        if (head == null) {
            head = new_node2;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new_node2;
    }

    // print node
    public void printNode() {
        if (head == null) {
            System.out.println("List is empty");
            
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
    //delete the node in last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next==null){
            head = null;
            return;
        }
        Node secondNode = head;
        Node lastNode = head.next;

        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next=null;
    }
    //delete in first

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        basic new_data = new basic();
        new_data.addFirst(15);
        new_data.addFirst(10);
        
        new_data.addLast(18);
        new_data.printNode();

        new_data.deleteLast();
        new_data.printNode();
        new_data.deleteFirst();
        new_data.printNode();
    }
}

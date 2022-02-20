public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = new Node();
        this.head.setData(0);
    }

    public LinkedList(int initialData) {
        this.head = new Node(initialData);
        this.head.setData(initialData);
    }
    
    public void add(int newData) {
        Node currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new Node(newData);
    }

    public void printList() {
        Node currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.getData());
            currNode = currNode.next;
        }
    }

}

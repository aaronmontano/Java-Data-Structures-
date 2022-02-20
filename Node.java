public class Node {

    private int data;
    protected Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int initialData) {
        this.data = initialData;
    }

    public void addNode(int newData) {
        this.next = new Node(newData);
    }

}

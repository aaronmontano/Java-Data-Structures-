// TODO Change method syntax standard from method() to method ().

public class LinkedList {

    public Node head;

    /**
     * @brief Default constructor for a LinkedList.
     *
     * Head Node is set to 0 and next Node pointed to is null.
     *
     * @return Default LinkedList with 0 as head Node.
     *
     * //TODO For default constructor, set this.head = null.
     */
    public LinkedList() {
        this.head = new Node();
        this.head.setData(0);
    }

    /**
     * @brief Parameterized constructor for a LinkedList.
     *
     * @param initialData - Data to be set in head Node.
     *
     * @return Parameterized LinkedList instance.
     */
    public LinkedList(int initialData) {
        this.head = new Node(initialData);
        this.head.setData(initialData);
    }

    /**
     * @brief Add a new Node of data to the end of a LinkedList instance.
     *
     * @param newData - Data value to be appended to the end of a LinkedList.
     *
     * @return NONE
     *
     * // TODO Create a case in which this.head is set to null.
     */
    public void add(int newData) {
        Node currNode = this.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new Node(newData);
    }

    /**
     * @brief Add an element to the front of the LinkedList.
     *
     * @param newData - Data value to be placed at the front of the LinkedList.
     *
     * @return NONE
     */
    public void addFirst(int newData) {
        Node newNode = new Node(newData);
        if (this.head != null) newNode.next = this.head;
        this.head = newNode;
    }

    /**
     * @brief Add an element to the end of the LinkedList.
     *
     * @param newData - Data value to be placed at the end of the LinkedList.
     *
     * @return NONE
     */
    public void addLast(int newData) {
        Node newNode = new Node(newData);
        Node currNode = this.head;
        if (this.head == null) this.head = newNode;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    /**
     * @brief Remove the first element from the LinkedList.
     *
     * @return NONE
     */
    public void removeFirst() {
        this.head = this.head == null ? null : this.head.next;
    }

    /**
     * @brief Remove the last element from the LinkedList.
     *
     * @return NONE
     */
    public void removeLast() {
        if (this.head != null) {
            if (this.head.next == null) {
                this.head = null;
            } else {
                Node currNode = this.head, prevNode = this.head;
                while (currNode.next != null) {
                    prevNode = currNode;
                    currNode = currNode.next;
                }
                currNode = null;
                prevNode.next = null;
            }
        }
    }

    /**
     * @brief Print out values of a LinkedList.
     *
     * @return NONE (values will be printed to the standard output on a single line).
     */
    public void printList() {
        Node currNode = this.head;

        System.out.print("[ ");
        while (currNode != null) {
            System.out.print(currNode.getData() + " ");
            currNode = currNode.next;
        }
        System.out.print("]\n");
    }

}

public class Node {

    private int data; /**< Data value of Node. */
    protected Node next; /**< Pointer to next Node. */

    /**
     * @brief Default constructor for Node.
     *
     * Default data value is 0 with next pointing to null.
     *
     * @param NONE
     *
     * @return Default Node instance.
     */
    public Node() {
        this.data = 0;
        this.next = null;
    }

    /**
     * @brief Parameterized Node constructor.
     *
     * @param data - Value to be placed in Node.
     *
     * @return Parameterized Node instance.
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    /**
     * @brief Retrieves data of Node instance.
     *
     * @param NONE
     *
     * @return Data value of Node instance.
     */
    public int getData() {
        return this.data;
    }

    /**
     * @brief Set data value of Node instance.
     *
     * @param initialData - Data value to be set in Node instance.
     *
     * @return NONE
     */
    public void setData(int initialData) {
        this.data = initialData;
    }

    /**
     * @brief Given a Node instance, set pointer to a new Node.
     *
     * @param newData - Data value of next Node in list.
     *
     * @return NONE
     */
    public void addNode(int newData) {
        this.next = new Node(newData);
    }

}

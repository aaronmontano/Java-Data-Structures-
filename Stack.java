public class Stack {

    public LinkedList stackData; /**< Stack of data. */

    /**
     * @brief Default constructor for a Stack.
     *
     * stackData is initialized to null for a default value.
     *
     * @return Default Stack with null as stackData.
     */
    public Stack () {
        this.stackData = new LinkedList ();
    }

    /**
     * @brief Parameterized constructor for a Stack.
     *
     * @param initialData - Data to be set as stackData.
     *
     * @return Parameterized Stack instance.
     */
    public Stack (int initialData) {
        this.stackData = new LinkedList (initialData);
    }

    /**
     * @brief Push data value to stop of Stack.
     *
     * @param val - Value to be pushed.
     *
     * @return NONE
     */
    public void push (int val) {
        this.stackData.addFirst (val);
    }

    /**
     * @brief Pop off top data value from Stack.
     *
     * @param NONE
     *
     * @return topVal - Data value at top of Stack.
     * TODO: Take into account when the Stack is empty / null.
     */
    public int pop () {
        int topVal = this.stackData.head.getData ();
        this.stackData.removeFirst ();
        return topVal;
    }

    /**
     * @brief Peek at data at the top of Stack.
     *
     * @param NONE
     *
     * @return topVal - Data value at top of Stack.
     * TODO: Take into account when the Stack is empty / null.
     */
    public int peek () {
        int topVal = this.stackData.head.getData ();
        return topVal;
    }

}

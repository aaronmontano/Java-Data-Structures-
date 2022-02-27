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

}

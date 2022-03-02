public class Queue {

    public LinkedList queueData; /**< Data to be held in Queue. */

    /**
     * @brief Default constructor for a Queue.
     *
     * queueData is set to null as default value.
     *
     * @return Default Queue with null as queueData.
     */
    public Queue () {
        this.queueData = new LinkedList ();
    }

    /**
     * @brief Parameterized constructor for Queue.
     *
     * @param initialData - Data to be set in queueData.
     *
     * @return Parameterized Queue instance.
     */
    public Queue (int initialData) {
        this.queueData = new LinkedList (initialData);
    }

    /**
     * @brief Add data to Queue.
     *
     * @param newData - Data to be added to Queue.
     *
     * @return NONE
     */
    public void add (int newData) {
        this.queueData.addLast (newData);
    }

}

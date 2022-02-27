public class TreeNode {

    public int data; /**< Data value of TreeNode. */
    public TreeNode left; /** < Pointer to the left TreeNode. */
    public TreeNode right; /** < Pointer to the right TreeNode. */

    /**
     * @brief Default constructor for a TreeNode.
     *
     * Default data value is 0 with both left and right TreeNodes
     * pointing to null.
     *
     * @param NONE
     *
     * @return Default TreeNode instance.
     */
    public TreeNode () {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    /**
     * @brief Parameterized TreeNode constructor.
     *
     * @param data - Value to be placed as in TreeNode instance.
     *
     * @return Parameterized TreeNode instance.
     */
    public TreeNode (int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /**
     * @brief Retrieves data of TreeNode instance.
     *
     * @param NONE
     *
     * @return Data value of TreeNode instance.
     */
    public int getData () {
        return this.data;
    }

    /**
     * @brief Set data value of TreeNode instance.
     *
     * @param initialData - Data value to be set in TreeNode instance.
     *
     * @return NONE
     */
    public void setData (int initialData) {
        this.data = initialData;
    }

}

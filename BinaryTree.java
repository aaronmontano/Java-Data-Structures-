public class BinaryTree {

    public TreeNode root; /**< Root TreeNode of BinaryTree. */

    /**
     * @brief Default constructor for a BinaryTree.
     *
     * Head TreeNode is set to 0 and both left and right TreeNodes
     * are initialized to null.
     *
     * @return Default BinaryTree instance with 0 as head TreeNode value.
     */
    public BinaryTree () {
        this.root = new TreeNode ();
    }

    /**
     * @brief Parameterized constructor for a BinaryTree.
     *
     * @param initialData - Data to be set in head TreeNode.
     *
     * @return Parameterized BinaryTree instance.
     */
    public BinaryTree (int initialData) {
        this.root = new TreeNode (initialData);
    }

}

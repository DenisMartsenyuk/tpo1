package function;

public class BinaryTree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            return;
        }
        recursiveInsert(root, value);
    }

    private void recursiveInsert(TreeNode node, int value) {
//        if (node)
    }

    public void delete(int value) {

    }

    public Integer find(int value) {
        return null;
    }
}

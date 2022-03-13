package algorithm;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int value) {
        this.root = recursiveInsert(root, value);
    }

    private TreeNode recursiveInsert(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.getValue()) {
            node.setLeft(recursiveInsert(node.getLeft(), value));
        } else {
            node.setRight(recursiveInsert(node.getRight(), value));
        }
        return node;
    }

    public void delete(int value) {
        this.root = recursiveDelete(root, value);
    }

    private TreeNode recursiveDelete(TreeNode node, int value) {
        if (node == null) {
            return null;
        }

        if (node.getValue() == value) {
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }

            if (node.getRight() == null) {
                return node.getLeft();
            }

            if (node.getLeft() == null) {
                return node.getRight();
            }

            int minValue = findMinNode(node.getRight());
            node.setValue(minValue);
            node.setRight(recursiveDelete(node.getRight(), minValue));
            return node;
        }

        if (value < node.getValue()) {
            node.setLeft(recursiveDelete(node.getLeft(), value));
        } else {
            node.setRight(recursiveDelete(node.getRight(), value));
        }
        return node;
    }

    private int findMinNode(TreeNode node) {
        return node.getLeft() == null ? node.getValue() : findMinNode(node.getLeft());
    }

    public Integer find(int value) {
        TreeNode foundNode = recursiveFind(root, value);
        return foundNode == null ? null : foundNode.getValue();
    }

    private TreeNode recursiveFind(TreeNode node, int value) {
        if (node == null) {
            return null;
        }

        if (node.getValue() == value) {
            return node;
        }

        return value < node.getValue() ? recursiveFind(node.getLeft(), value) : recursiveFind(node.getRight(), value);
    }
}

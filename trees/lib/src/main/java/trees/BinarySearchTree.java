package trees;

public class BinarySearchTree extends BinaryTree<Integer> {

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public Node<Integer> addRecursive  (Node<Integer> current, int value) {
        if (current == null) {
            return new Node<>(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public boolean contains(int value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node<Integer> current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        } else if (value < current.value) {
            return containsRecursive(current.left, value);
        } else {
            return containsRecursive(current.right, value);
        }
    }


}


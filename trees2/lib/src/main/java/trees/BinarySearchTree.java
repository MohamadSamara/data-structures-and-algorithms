package trees2;

public class BinarySearchTree extends BinaryTree<Integer> {

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node<Integer> addRecursive  (Node<Integer> current, int value) {
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

    public boolean contains(Node<Integer> current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        } else if (value < current.value) {
            return contains(current.left, value);
        } else {
            return contains(current.right, value);
        }
    }


}


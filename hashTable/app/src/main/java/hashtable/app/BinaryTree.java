package hashtable.app;

import java.util.ArrayList;

public class BinaryTree {
    Node root;
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public ArrayList<Integer> traverseInOrder(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        traverseInOrderHelperFunction(node, list);
        return list;
    }

    private void traverseInOrderHelperFunction(Node node, ArrayList<Integer> list) {
        if (node != null) {
            traverseInOrderHelperFunction(node.left, list);
            list.add(node.value);
            traverseInOrderHelperFunction(node.right, list);
        }
    }

    public ArrayList<Integer> traversePreOrder(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        traversePreOrderHelperFunction(node, list);
        return list;
    }

    private void traversePreOrderHelperFunction(Node node, ArrayList<Integer> list) {
        if (node != null) {
            list.add(node.value);
            traversePreOrderHelperFunction(node.left, list);
            traversePreOrderHelperFunction(node.right, list);
        }
    }

    public ArrayList<Integer> traversePostOrder(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        traversePostOrderHelperFunction(node, list);
        return list;
    }

    private void traversePostOrderHelperFunction(Node node, ArrayList<Integer> list) {
        if (node != null) {
            traversePostOrderHelperFunction(node.left, list);
            traversePostOrderHelperFunction(node.right, list);
            list.add(node.value);
        }
    }



}


package hashtable.app.TreeIntersection;


import hashtable.app.BinaryTree;
import hashtable.app.HashMap;
import hashtable.app.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {
    private final HashMap<Integer, Integer> hashMap = new HashMap<>(10);
    private final List<Integer> intersections = new ArrayList<>();

    public List<Integer> treeIntersection(BinaryTree tree1, BinaryTree tree2) {
        if (tree1.getRoot() == null || tree2.getRoot() == null) {
            return null;
        }
        traverse(tree1.getRoot());

        compare(tree2.getRoot());

        return intersections;
    }

    private void traverse(Node node) {
        if (node != null) {
            hashMap.set(node.getValue(), 1);

            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }

    private void compare(Node node) {
        if (node != null) {
            if (hashMap.get(node.getValue()) != null) {
                intersections.add(node.getValue());
            }
            compare(node.getLeft());
            compare(node.getRight());
        }
    }
}
package hashtable.app;

import hashtable.app.TreeIntersection.TreeIntersection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TreeIntersectionTest {
    BinaryTree emptyTree;
    BinaryTree normalTree;
    BinaryTree threeNodes;
    BinaryTree onlyLeftNodes;

    @BeforeEach
    public void beforeEachTest() {
        emptyTree = new BinaryTree();
        normalTree = new BinaryTree();
        threeNodes = new BinaryTree();
        onlyLeftNodes = new BinaryTree();

        normalTree.setRoot(new Node(10));
        normalTree.getRoot().setLeft(new Node(20));
        normalTree.getRoot().setRight(new Node(30));
        normalTree.getRoot().getLeft().setLeft(new Node(40));
        normalTree.getRoot().getLeft().setRight(new Node(40));
        normalTree.getRoot().getRight().setLeft(new Node(50));
        normalTree.getRoot().getRight().setRight(new Node(60));

        threeNodes.setRoot(new Node(10));
        threeNodes.getRoot().setLeft(new Node(20));
        threeNodes.getRoot().setRight(new Node(150));


        onlyLeftNodes.setRoot(new Node(10));
        onlyLeftNodes.getRoot().setLeft(new Node(20));
        onlyLeftNodes.getRoot().getLeft().setLeft(new Node(30));
        onlyLeftNodes.getRoot().getLeft().getLeft().setLeft(new Node(150));
    }

    @Test
    public void testWithOneEmptyTree() {
        TreeIntersection app = new TreeIntersection();
        List <Integer> repeated = app.treeIntersection(emptyTree, normalTree);

        assertNull(repeated);
    }

    @Test
    public void testWithTreeHasThreeNodes() {
        TreeIntersection app = new TreeIntersection();
        List<Integer> repeated = app.treeIntersection(threeNodes, normalTree);

        assertEquals("[10, 20]", repeated.toString());
    }


    @Test
    public void testWithTreeHasLeftNodes() {
        TreeIntersection app = new TreeIntersection();
        List<Integer> repeated = app.treeIntersection(onlyLeftNodes, normalTree);

        assertEquals("[10, 20, 30]", repeated.toString());
    }

    @Test
    public void testTreesHasRandomNodes() {
        TreeIntersection app = new TreeIntersection();
        List<Integer> repeated = app.treeIntersection(onlyLeftNodes, threeNodes);

        assertEquals("[10, 20, 150]", repeated.toString());
    }

    @Test
    public void testSameTree() {
        TreeIntersection app = new TreeIntersection();
        List<Integer> repeated = app.treeIntersection(normalTree, normalTree);

        assertEquals("[10, 20, 40, 40, 30, 50, 60]", repeated.toString());
    }


}
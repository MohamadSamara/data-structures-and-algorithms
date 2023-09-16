/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class LibraryTest {


    @Test
    public void testEmptyTree() {
        BinarySearchTree bst = new BinarySearchTree();
        assertTrue(bst.isEmpty());
    }

    @Test
    public void testTreeWithSingleRoot() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        assertFalse(bst.isEmpty());
        assertTrue(bst.contains(20));
    }

    @Test
    public void testAddLeftAndRight() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        assertFalse(bst.isEmpty());
        assertTrue(bst.contains(20));
        assertTrue(bst.contains(30));
    }

    @Test
    public void testPreOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        List<Integer> expected = Arrays.asList(20, 10, 30);
        List<Integer> result = bst.traversePreOrder(bst.root);
        assertEquals(expected, result);
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        List<Integer> expected = Arrays.asList(10, 20, 30);
        List<Integer> result = bst.traverseInOrder(bst.root);
        assertEquals(expected, result);
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(10);
        bst.add(30);
        List<Integer> expected = Arrays.asList(10, 30, 20);
        List<Integer> result = bst.traversePostOrder(bst.root);
        assertEquals(expected, result);
    }

    @Test
    public void testContains() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(20);
        bst.add(30);
        assertTrue(bst.contains(10));
        assertTrue(bst.contains(20));
        assertTrue(bst.contains(30));
        assertFalse(bst.contains(40));
    }

}
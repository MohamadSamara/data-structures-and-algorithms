package trees2;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree<T>{
    Node<Integer> root;


    public ArrayList<Integer> traverseInOrder(Node<Integer> node) {
        ArrayList<Integer> listInOrder = new ArrayList<>();
        Stack<Node<Integer>> stack = new Stack<>();
        Node<Integer> current = node;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                listInOrder.add(current.value);
                current = current.right;
            }
        }

        return listInOrder;
    }


    public ArrayList<Integer> traversePreOrder(Node<Integer> node) {
        ArrayList<Integer> listPreOrder = new ArrayList<>();
        Stack<Node<Integer>> stack = new Stack<>();
        Node<Integer> current = node;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                listPreOrder.add(current.value); // Add to result before pushing to achieve pre-order
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                current = current.right;
            }
        }

        return listPreOrder;
    }



    public ArrayList<Integer> traversePostOrder(Node<Integer> node) {
        ArrayList<Integer> listPostOrder = new ArrayList<>();
        if (node == null) {
            return listPostOrder;
        }

        Stack<Node<Integer>> stack1 = new Stack<>();
        Stack<Node<Integer>> stack2 = new Stack<>();

        stack1.push(node);

        while (!stack1.isEmpty()) {
            Node<Integer> current = stack1.pop();
            stack2.push(current);

            if (current.left != null) {
                stack1.push(current.left);
            }

            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        while (!stack2.isEmpty()) {
            Node<Integer> current = stack2.pop();
            listPostOrder.add(current.value);
        }

        return listPostOrder;
    }

}

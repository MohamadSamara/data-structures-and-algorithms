package trees;

import trees.queue.Queue;

import java.util.ArrayList;

public class BinaryTree<T>{
    Node<Integer> root;

    public ArrayList<Integer> traverseInOrder(Node<Integer> node) {
        ArrayList<Integer> list = new ArrayList<>();
        traverseInOrderHelperFunction(node, list);
        return list;
    }

    private void traverseInOrderHelperFunction(Node<Integer> node, ArrayList<Integer> list) {
        if (node != null) {
            traverseInOrderHelperFunction(node.left, list);
            list.add(node.value);
            traverseInOrderHelperFunction(node.right, list);
        }
    }
//    public ArrayList<Integer> traverseInOrder(Node<Integer> node) {
//        ArrayList<Integer> listInOrder = new ArrayList<>();
//        Stack<Node<Integer>> stack = new Stack<>();
//        Node<Integer> current = node;
//        while (!stack.isEmpty() || current != null) {
//            if (current != null) {
//                stack.push(current);
//                current = current.left;
//            } else {
//                current = stack.pop();
//                listInOrder.add(current.value);
//                current = current.right;
//            }
//        }
//        return listInOrder;
//    }

    public ArrayList<Integer> traversePreOrder(Node<Integer> node) {
        ArrayList<Integer> list = new ArrayList<>();
        traversePreOrderHelperFunction(node, list);
        return list;
    }

    private void traversePreOrderHelperFunction(Node<Integer> node, ArrayList<Integer> list) {
        if (node != null) {
            list.add(node.value);
            traversePreOrderHelperFunction(node.left, list);
            traversePreOrderHelperFunction(node.right, list);
        }
    }

//    public ArrayList<Integer> traversePreOrder(Node<Integer> node) {
//        ArrayList<Integer> listPreOrder = new ArrayList<>();
//        Stack<Node<Integer>> stack = new Stack<>();
//        Node<Integer> current = node;
//        while (!stack.isEmpty() || current != null) {
//            if (current != null) {
//                listPreOrder.add(current.value);
//                stack.push(current);
//                current = current.left;
//            } else {
//                current = stack.pop();
//                current = current.right;
//            }
//        }
//        return listPreOrder;
//    }

    public ArrayList<Integer> traversePostOrder(Node<Integer> node) {
        ArrayList<Integer> list = new ArrayList<>();
        traversePostOrderHelperFunction(node, list);
        return list;
    }

    private void traversePostOrderHelperFunction(Node<Integer> node, ArrayList<Integer> list) {
        if (node != null) {
            traversePostOrderHelperFunction(node.left, list);
            traversePostOrderHelperFunction(node.right, list);
            list.add(node.value);
        }
    }


//    public ArrayList<Integer> traversePostOrder(Node<Integer> node) {
//        ArrayList<Integer> listPostOrder = new ArrayList<>();
//        if (node == null) {
//            return listPostOrder;
//        }
//        Stack<Node<Integer>> stack1 = new Stack<>();
//        Stack<Node<Integer>> stack2 = new Stack<>();
//        stack1.push(node);
//        while (!stack1.isEmpty()) {
//            Node<Integer> current = stack1.pop();
//            stack2.push(current);
//            if (current.left != null) {
//                stack1.push(current.left);
//            }
//            if (current.right != null) {
//                stack1.push(current.right);
//            }
//        }
//        while (!stack2.isEmpty()) {
//            Node<Integer> current = stack2.pop();
//            listPostOrder.add(current.value);
//        }
//        return listPostOrder;
//    }



    private int max = 0;
    public Integer getMaxValue(){
        if (root == null) {
            System.out.println("Tree is Empty!");
            return null;
        }
        else {
            max = root.value;
            findMaxHelperFunction(root);
        }
        return max;
    }

    private void findMaxHelperFunction(Node<Integer> node){
        if(node != null) {
            if(node.value > max){
                max = node.value;
            }
            findMaxHelperFunction(node.left);
            findMaxHelperFunction(node.right);
        }
    }



    public ArrayList<Integer> breadthFirst(BinaryTree<T> tree) throws Exception {

        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node<Integer>> nodes = new Queue<>();
        if(tree.root != null) {
            nodes.enqueue(tree.root);
        }
        while(!nodes.isEmpty()) {
            Node<Integer> temp = nodes.dequeue();
            result.add(temp.value);
            if(temp.left != null) {
                nodes.enqueue(temp.left);
            }
            if(temp.right != null) {
                nodes.enqueue(temp.right);
            }
        }
        return result;
    }

}


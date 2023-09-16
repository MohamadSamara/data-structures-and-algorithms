/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees2;

public class Library {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();
        BinaryTree bt3 = new BinaryTree();


        BinarySearchTree bst = new BinarySearchTree();


        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(2);
        bst.add(4);





        System.out.println(bt.traverseInOrder(bt.root));

        System.out.println(bt2.traversePreOrder(bt2.root));

        System.out.println(bt3.traversePostOrder(bt3.root));

        System.out.println("Contains 3 : " + bst.contains(bst.root,3)); // Should print true
        System.out.println("Contains 6 : " + bst.contains(bst.root,6)); // Should print false


    }

}
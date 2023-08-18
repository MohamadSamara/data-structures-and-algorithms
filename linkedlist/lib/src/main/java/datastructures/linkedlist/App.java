package datastructures.linkedlist;
public class App {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insert(10);
        linkedList.insert(9);
        linkedList.insert(5);
        linkedList.insert(11);

        System.out.println(linkedList.includes(9));
        System.out.println(linkedList.includes(4));

        System.out.println(linkedList);
    }
}

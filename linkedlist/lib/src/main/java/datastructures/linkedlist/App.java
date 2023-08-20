package datastructures.linkedlist;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insert(10);
        linkedList.insert(9);
        linkedList.insert(5);
        linkedList.insert(11);

        System.out.println("Contains 9: " + linkedList.includes(9));
        System.out.println("Contains 4: " + linkedList.includes(4));

        System.out.println("Initial List: " + linkedList);

        // Append
        linkedList.append(7);
        linkedList.append(8);
        System.out.println("After Append: " + linkedList);

        // Insert Before
        linkedList.insertBefore(5, 6);
        linkedList.insertBefore(11, 12);
        System.out.println("After Insert Before: " + linkedList);

        // Insert After
        linkedList.insertAfter(8, 13);
        linkedList.insertAfter(7, 14);
        System.out.println("After Insert After: " + linkedList);
    }
}

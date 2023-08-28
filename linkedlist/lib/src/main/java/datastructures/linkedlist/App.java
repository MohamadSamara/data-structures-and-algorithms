package datastructures.linkedlist;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();


        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.append(3);
        linkedList1.append(4);

        System.out.println(linkedList1);

        linkedList2.append(5);
        linkedList2.append(6);
        linkedList2.append(7);
        System.out.println(linkedList2);

        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.zipLists(linkedList1, linkedList2);




//        System.out.println("Contains 9: " + linkedList.includes(9));
//        System.out.println("Contains 4: " + linkedList.includes(4));
//
//        System.out.println("Initial List: " + linkedList);
//
//        // Append
//        linkedList.append(7);
//        linkedList.append(8);
//        System.out.println("After Append: " + linkedList);
//
//        // Insert Before
//        linkedList.insertBefore(5, 6);
//        linkedList.insertBefore(11, 12);
//        System.out.println("After Insert Before: " + linkedList);
//
//        // Insert After
//        linkedList.insertAfter(8, 13);
//        linkedList.insertAfter(7, 14);
//        System.out.println("After Insert After: " + linkedList);
//
//
//        //kthFromEnd
//        try {
//            System.out.println("k-th value from end: " + linkedList.kthFromEnd(1));
//        } catch (IllegalArgumentException e) {
//            System.out.println("Exception: " + e.getMessage());
//        }
    }
}

package datastructures.pseudoQueue;

public class App {
    public static void main(String[] args) {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(20);

        System.out.println(pseudoQueue.dequeue()); // Output: 5
        System.out.println(pseudoQueue.dequeue()); // Output: 10
    }
}

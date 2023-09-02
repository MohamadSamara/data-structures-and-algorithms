package datastructures.queue;

public class App {
    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue: " + queue); // Output: Queue: {1} -> {2} -> {3}

    }
}

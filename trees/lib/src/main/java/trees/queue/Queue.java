package trees.queue;

import trees.Node;

public class Queue<T> {
    private QueueNode<T> front;
    private QueueNode<T> back;

    public void enqueue(Node<Integer> value) {
        QueueNode<T> node = new QueueNode<>(value);
        if (isEmpty()) {
            front = node;
        } else {
            back.next = node;
        }
        back = node;
    }

    public T dequeue() throws Exception {
        if (front == null) {
            throw new Exception("Your Queue Is Empty!");
        }
        QueueNode<T> tempRef = front;
        front = front.next;
        tempRef.next = null;
        return tempRef.value;

    }
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        if (front == null) {
            return "Your queue Is Empty";
        }

        QueueNode<T> tempRef = front;
        String print = "Front <- ";
        while (tempRef.next != null) {
            print = print + "{" + tempRef.value + "} <- ";
            tempRef = tempRef.next;
        }
        print += "{" + tempRef.value + "} back -> Null";
        return print;
    }
}

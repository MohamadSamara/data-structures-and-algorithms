package datastructures.queue;

public class Node<T> {
    public Node next;
    public T value;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
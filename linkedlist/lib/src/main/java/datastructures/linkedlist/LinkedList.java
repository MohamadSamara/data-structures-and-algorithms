package datastructures.linkedlist;

public class LinkedList<T> {

    public Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    public boolean includes(T value) {
        Node<T> currentNode = head;
        if (isEmpty()) {
            System.out.println("The LinkedList is Empty");
            return false;
        }
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public String toString() {

        if(isEmpty()){
            return "The LinkedList is Empty";
        }
        Node<T> currentNode = head;
        StringBuilder x = new StringBuilder();
        while (currentNode != null) {
            x.append("{").append(currentNode.value).append("} -> ");
            currentNode = currentNode.next;
        }
return x + "NULL" ;
    }

    // ============== CC06 =========================

    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertBefore(T targetValue, T newValue) {
        Node<T> newNode = new Node<>(newValue);
        if (isEmpty()) {
            System.out.println("Cannot insert before. The LinkedList is Empty");
            return;
        }
        if (head.value == targetValue) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == targetValue) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("No change, method exception");
    }

    public void insertAfter(T targetValue, T newValue) {
        Node<T> newNode = new Node<>(newValue);
        if (isEmpty()) {
            System.out.println("The LinkedList is Empty Cannot insert after");
            return;
        }
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == targetValue) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("No change, method exception");
    }

}

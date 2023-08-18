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

}
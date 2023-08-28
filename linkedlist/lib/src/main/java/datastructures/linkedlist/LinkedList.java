package datastructures.linkedlist;

import java.util.List;

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

        if (isEmpty()) {
            return "The LinkedList is Empty";
        }
        Node<T> currentNode = head;
        StringBuilder x = new StringBuilder();
        while (currentNode != null) {
            x.append("{").append(currentNode.value).append("} -> ");
            currentNode = currentNode.next;
        }
        return x + "NULL";
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

    public T kthFromEnd(int k) {

        if (isEmpty()) {
            throw new IllegalArgumentException("The linked list is empty");
        }
        if (k < 0) {
            throw new IllegalArgumentException("k must be a positive (k => 0)");
        }
        int length = 0;
        Node<T> current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        if (k >= length) {
            throw new IllegalArgumentException("k is greater than the length of the linked list");
        }
        current = head;
        for (int i = 1; i < length - k; i++) {
            current = current.next;
        }
        return current.value;
    }

        public LinkedList<T> zipLists(LinkedList<T> firstLinkedList, LinkedList<T> secoundLinkedList) {

            if (firstLinkedList.isEmpty()) {
                System.out.println(secoundLinkedList);
                return secoundLinkedList;
            }
            if (secoundLinkedList.isEmpty()) {
                System.out.println(firstLinkedList);
                return firstLinkedList;
            }
            LinkedList<T> newLinkedList = new LinkedList<>();
            Node<T> currentForFirst = firstLinkedList.head;
            Node<T> currentForSecond = secoundLinkedList.head;

            while(currentForFirst != null || currentForSecond != null) {

                if(currentForFirst != null){
                    newLinkedList.append(currentForFirst.value);
                    currentForFirst = currentForFirst.next;
                }

                if(currentForSecond != null){
                    newLinkedList.append(currentForSecond.value);
                    currentForSecond = currentForSecond.next;
                }
            }

            System.out.println(newLinkedList);
            return newLinkedList;
        }

}

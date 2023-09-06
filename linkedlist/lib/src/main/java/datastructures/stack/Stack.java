package datastructures.stack;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T value = top.value;
        top = top.next;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.value;
    }

    @Override
    public String toString() {

        if (isEmpty()) {
            return "Empty Stack";
        }

        StringBuilder sb = new StringBuilder();
        Node<T> current = top;
        sb.append("{");
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append("} -> {");
            }
            current = current.next;
        }
        sb.append("}");
        return sb.toString();
    }

}
package datastructures.stack;

public class App {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack); // Output: Stack: {3} -> {2} -> {1}

    }
}

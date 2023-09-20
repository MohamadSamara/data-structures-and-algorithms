package datastructures.maxStack;

import datastructures.stack.Stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<>();
        mainStack.push(9);
        mainStack.push(6);
        mainStack.push(1);
        mainStack.push(2);
        mainStack.push(3);
        mainStack.push(4);
        mainStack.push(5);
        mainStack.push(6);
        mainStack.push(7);

        Stack<Integer> maxstack = new Stack<>();

        MaxStack maxStack = new MaxStack(mainStack , maxstack);
        System.out.println(maxStack.getMax());
    }
}

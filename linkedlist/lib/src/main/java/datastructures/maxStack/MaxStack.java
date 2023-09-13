package datastructures.maxStack;

import datastructures.stack.Stack;

public class MaxStack {

    Stack<Integer> mainStack;
    Stack<Integer> maxStack;

    public MaxStack(Stack<Integer> mainStack, Stack<Integer> maxStack) {
        this.mainStack = mainStack;
        this.maxStack = maxStack;
    }

    public void getMax() {

        if (mainStack.isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }
            int max = maxStack.isEmpty() ? Integer.MIN_VALUE : maxStack.peek();
            int newMax;

            while (!mainStack.isEmpty()) {
                newMax = mainStack.peek(); //
                if (newMax > max) {
                    maxStack.push(newMax);
                    max = newMax;
                }
                mainStack.pop();
            }
            System.out.println(maxStack.peek());

        }


}

package datastructures.pseudoQueue;

import datastructures.stack.Stack;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
    private final Stack<T> mainStack; // The main stack for enqueue and dequeue operations
    private final Stack<T> tempStack; // Temporary stack for maintaining the queue order

    public PseudoQueue(){
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void enqueue(T value){
        while (!(mainStack.isEmpty())){
            tempStack.push(mainStack.pop());
        }
        tempStack.push(value);
        while (!(tempStack.isEmpty())){
            mainStack.push(tempStack.pop());
        }
    }

    public T dequeue(){
        if(!(mainStack.isEmpty())){
            return mainStack.pop();
        } else {
            throw new NoSuchElementException("PseudoQueue is empty");
        }
    }

    public String toString() {
        return mainStack.toString();
    }
}
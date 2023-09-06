package stack;
import datastructures.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StackTest {

    @Test
    public void testPushOntoStack() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals("{1}", stack.toString());
    }

    @Test
    public void testPushMultipleValuesOntoStack() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertFalse(stack.isEmpty());
        assertEquals("{3} -> {2} -> {1}", stack.toString());
    }

    @Test
    public void testPopOffStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals("{2} -> {1}", stack.toString());
    }

    @Test
    public void testEmptyStackAfterMultiplePops() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals("Empty Stack", stack.toString());
    }

    @Test
    public void testPeekNextItemOnStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @Test
    public void testInstantiateEmptyStack() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
        assertEquals("Empty Stack", stack.toString());
    }

    @Test
    public void testPopOnEmptyStackRaisesException() {
        Stack<Integer> stack = new Stack<>();
        try {
            stack.pop();
        } catch (RuntimeException e) {
            assertEquals("Stack is empty", e.getMessage());
        }
    }

    @Test
    public void testPeekOnEmptyStackRaisesException() {
        Stack<Integer> stack = new Stack<>();
        try {
            stack.peek();
        } catch (RuntimeException e) {
            assertEquals("Stack is empty", e.getMessage());
        }
    }
}

package queue;

import datastructures.queue.Queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void testEnqueueIntoQueue() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        assertEquals("{1}", queue.toString());
    }

    @Test
    public void testEnqueueMultipleValuesIntoQueue() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertFalse(queue.isEmpty());
        assertEquals("{1} -> {2} -> {3}", queue.toString());
    }

    @Test
    public void testDequeueOutOfQueueTheExpectedValue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        assertEquals("{2}", queue.toString());
    }

    @Test
    public void testEmptyQueueAfterMultipleDequeues() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        assertTrue(queue.isEmpty());
        assertEquals("Empty Queue", queue.toString());
    }

    @Test
    public void testPeekIntoQueueSeeingTheExpectedValue() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        assertEquals(10, queue.peek());
    }

    @Test
    public void testInstantiateEmptyQueue() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
        assertEquals("Empty Queue", queue.toString());
    }

    @Test
    public void testDequeueOnEmptyQueueRaisesException() {
        Queue<Integer> queue = new Queue<>();
        try {
            queue.dequeue();
        } catch (RuntimeException e) {
            assertEquals("Queue is empty", e.getMessage());
        }
    }

    @Test
    public void testPeekOnEmptyQueueRaisesException() {
        Queue<Integer> queue = new Queue<>();
        try {
            queue.peek();
        } catch (RuntimeException e) {
            assertEquals("Queue is empty", e.getMessage());
        }
    }

}

package pseudoQueue;

import datastructures.pseudoQueue.PseudoQueue;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;
public class PseudoQueueTest {

    @Test
    public void testEnqueueAndDequeue() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(15);

        assertEquals(5, pseudoQueue.dequeue());
        assertEquals(10, pseudoQueue.dequeue());
        assertEquals(15, pseudoQueue.dequeue());
    }

    @Test
    public void testEnqueueAndDequeueMixedIntegers() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(15);

        assertEquals(5, pseudoQueue.dequeue());
        assertEquals(10, pseudoQueue.dequeue());
        assertEquals(15, pseudoQueue.dequeue());
    }

    @Test
    public void testDequeueOnEmptyPseudoQueueRaisesException() {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

        assertThrows(NoSuchElementException.class, () -> {
            pseudoQueue.dequeue();
        });
    }
}

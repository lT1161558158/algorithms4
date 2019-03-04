package structure.impl;

import org.junit.Test;
import structure.Queue;

import static org.junit.Assert.*;

public class LinkedQueueTest {

    @Test
    public void test(){
        int count=4;
        Queue<Integer> queue=new LinkedQueue<>();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
        for (int i = 0; i < count; i++) {
            queue.enqueue(i);
            assertEquals(i+1, queue.size());
        }
        assertFalse(queue.isEmpty());
        assertEquals(count, queue.size());
        for (int i = 0; i < count; i++) {
            Integer dequeue = queue.dequeue();
            assertEquals(count-i-1, queue.size());
            assertEquals(dequeue, new Integer(i));
        }
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

    }
}
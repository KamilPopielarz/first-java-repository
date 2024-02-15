package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class Exercise61QueuesTest {

    @Test
    public void testFifo() {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        Assertions.assertEquals(queue.size(), 3);
        Integer head = queue.poll();
        Assertions.assertEquals(head, 10);
        Assertions.assertTrue(queue.contains(20));
        Assertions.assertFalse(queue.contains(10));

    }

    @Test
    public void testLifo() {
        LinkedList<Integer> queue1 = new LinkedList<>();

        queue1.addFirst(10);
        queue1.addFirst(20);
        queue1.addFirst(30);

        Assertions.assertEquals(queue1.size(),3);
        Assertions.assertEquals(queue1.poll(),30);
        Assertions.assertTrue(queue1.contains(20));
        Assertions.assertFalse(queue1.contains(30));

    }


}
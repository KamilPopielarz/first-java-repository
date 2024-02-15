package collections;

import java.util.LinkedList;
import java.util.Queue;
// FIFO first in first out
// LIFO last in first out
public class Exercise61Queues {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        queue.offer(10);
        queue.offer(20);
        queue.offer(30);


        System.out.println("Elements in queue: " + queue);


        Integer head = queue.peek();
        System.out.println("Queue head (peek): " + head);


        Integer removedElement = queue.poll();
        System.out.println("Removed element (poll): " + removedElement);
        System.out.println("Elements in queue after removing: " + queue);

        System.out.println("___________");
        LinkedList<Integer> queue1 = new LinkedList<>();

        queue1.addFirst(10);
        queue1.addFirst(20);
        queue1.addFirst(30);

        Integer head1 = queue1.removeFirst();
        System.out.println(queue1);
    }
}

package Queues;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    // Queues are a First in First Out data structure
    public static void main(String[] args) {

        //create a queue named queue. Cannot create instance of Queue so must use LinkedList
        Queue<String> queue = new LinkedList<String>();

        //add items to queue.  offer adds items to the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        queue.offer("Bill");
        queue.offer("Bob");
        queue.offer("Tom");

        // print item at head of queue
        System.out.println(queue.peek());

        //print all items in queue
        System.out.println(queue);

        // remove item at the head of the queue. poll will remove the item at the head.
        queue.poll();

        //print all remaining items in the queue
        System.out.println(queue);

        queue.poll();
        queue.poll();

        System.out.println(queue);

        //print boolean value of whether queue is empty or not
        System.out.println(queue.isEmpty());

        //print size of the queue
        System.out.println(queue.size());

        //print boolean value for whether or not the queue contains the value "Tom"
        System.out.println(queue.contains("Tom"));
        

    }
}

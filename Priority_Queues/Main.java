package Priority_Queues;
import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    // Priority queues are a data structure that has the highest priority items first
    public static void main(String[] args) {

        Queue<Double> grades = new PriorityQueue<>();

        grades.offer(3.0);
        grades.offer(2.5);
        grades.offer(4.0);
        grades.offer(1.5);
        grades.offer(2.0);

        while(!grades.isEmpty()) {
            System.out.println(grades.poll());

        }

        
        Queue<Double> gradesReversed = new PriorityQueue<>(Collections.reverseOrder());

        gradesReversed.offer(3.0);
        gradesReversed.offer(2.5);
        gradesReversed.offer(4.0);
        gradesReversed.offer(1.5);
        gradesReversed.offer(2.0);

        while (!gradesReversed.isEmpty()) {
            System.out.println(gradesReversed.poll());
            
        }



    }
    

}

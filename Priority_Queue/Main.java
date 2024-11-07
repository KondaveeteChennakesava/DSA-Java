import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        // Info: Applications
        // 1: Task Scheduling
        // 2: Pathfinding Algorithms
        // 3: Network Routing
        // 4: Load Balancing in Clod Computing 

        // offer(), poll(), peek(), isEmpty(), contains()


        // Queue<Double> queue = new PriorityQueue<>();  // Ascending Order
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());   //Descending Order
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        // queue.offer(3.0);
        // queue.offer(2.9);
        // queue.offer(5.6);
        // queue.offer(3.1);
        // queue.offer(9.8);

        queue.offer("A");
        queue.offer("B");
        queue.offer("c");
        queue.offer("a");
        queue.offer("z");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

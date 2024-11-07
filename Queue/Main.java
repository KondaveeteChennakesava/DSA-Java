import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        // Info: Applications
        // 1: Keyboard Buffers(letters shouls appear on the screen in the order they are pressed).
        // 2: Printer queue(prints should complete in the order)
        // 3: Used in LinkedLists, PriorityQueues, Breadth-First-Search


        // offer(), poll(), peek(), isEmpty(), contains()

        // We cannot create instance to Queue as it is a interface. So, we use LinkedList to implement Queue.
        Queue<String> queue = new LinkedList<>();

        queue.offer("Kesava");
        queue.offer("Sasankh");
        queue.offer("Ravi");
        queue.offer("Shannu");
        queue.offer("Uday");

        queue.poll();

        System.out.println(queue.contains("Sasankh"));
    }
}

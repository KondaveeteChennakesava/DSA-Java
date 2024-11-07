import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        // Info: Applications
        // 1: Implement Stacks/Queues
        // 2: GPS Navigation
        // 3: Music Playlist
        
        LinkedList<String> linkedList = new LinkedList<String>();

        // Linkedlist as a stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("E");
        // linkedList.push("F");

        // Linkedlist as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");

        linkedList.add(6, "G" );
        linkedList.remove("G");
        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        linkedList.addFirst("Z");
        linkedList.addLast("L");

        System.out.println(linkedList.poll());
        System.out.println(linkedList+" "+first+" "+last);
    }
}

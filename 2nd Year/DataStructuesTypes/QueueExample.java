import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue elements:");
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue elements after removal:");
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Is Queue empty? " + queue.isEmpty());

        while (!queue.isEmpty()) {
            System.out.println("Removed element: " + queue.remove());
        }

        System.out.println("Is Queue empty? " + queue.isEmpty());
    }
}

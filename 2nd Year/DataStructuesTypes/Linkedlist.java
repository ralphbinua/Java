import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("LinkedList elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        colors.remove("Green");
        System.out.println("LinkedList elements after removal:");
        for (String color : colors) {
            System.out.println(color);
        }

        colors.addFirst("Purple");
        System.out.println("LinkedList elements after adding to beginning:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

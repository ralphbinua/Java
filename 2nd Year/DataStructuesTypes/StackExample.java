import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Stack elements:");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack elements after popping:");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Is Stack empty? " + stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        System.out.println("Is Stack empty? " + stack.isEmpty());
    }
}

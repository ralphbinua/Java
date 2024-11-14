import java.util.Stack;


public class balanced {


   public boolean isBalanced(String str) {
       Stack<Character> stack = new Stack<>();
       for (char ch : str.toCharArray()) {
           if (ch == '(') {
               stack.push(ch);
           } else if (ch == ')') {
               if (stack.isEmpty()) {
                   return false;
               }
               stack.pop();
           }
       }
       return stack.isEmpty();
   }
}

import java.util.*;
public class Stack <T>{
    private ArrayList<T> items;

    public Stack(){
        items = new ArrayList<>();
    }

    public void push(T item){
        items.add(item);
    }

    public T pop(){
        if(items.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return items.remove(items.size()-1);
    }

    public T peek(){
        if(items.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return items.get(items.size()-1);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }
}

class PostfixEvaluator {

    public static int evaluatePostfix(String expression) {
        // Create a stack to store operands
        Stack<Integer> stack = new Stack<>();

        // Split the expression into tokens (operators and operands)
        String[] tokens = expression.split("\\s+");

        // Iterate through each token
        for (String token : tokens) {
            // If the token is a numeric value, push it onto the stack
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                // If the token is an operator, pop two operands from the stack,
                // perform the operation, and push the result back onto the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }

        // The final result is the only element left on the stack
        return stack.pop();
    }
    private static boolean isNumeric(String str) {
        try {
            // Try to parse the string as an integer
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            // If parsing fails, the string is not numeric
            return false;
        }
    }
    private static int performOperation(String operator, int a, int b) {
        switch (operator) {
            case "+":
                // Addition
                return a + b;
            case "-":
                // Subtraction
                return a - b;
            case "*":
                // Multiplication
                return a * b;
            case "/":
                // Division
                return a / b;
            default:
                // Invalid operator
                throw new IllegalStateException("Invalid operator: " + operator);
        }
    }
}

 class InfixToPostfixConverter {

    public static String convert(String infixExpression) {
        // Create a stack to store operators
        Stack<Character> operatorStack = new Stack<>();

        // Create a string to store the postfix expression
        StringBuilder postfixExpression = new StringBuilder();

        // Iterate through each character in the infix expression
        for (char c : infixExpression.toCharArray()) {
            // If the character is a digit or a letter, add it to the postfix expression
            if (Character.isDigit(c) || Character.isLetter(c)) {
                postfixExpression.append(c).append(" ");
            }
            // If the character is an opening parenthesis, push it onto the operator stack
            else if (c == '(') {
                operatorStack.push(c);
            }
            // If the character is a closing parenthesis, pop operators from the stack until the opening parenthesis is found
            else if (c == ')') {
                while (operatorStack.peek() != '(') {
                    postfixExpression.append(operatorStack.pop()).append(" ");
                }
                // Remove the opening parenthesis from the stack
                operatorStack.pop();
            }
            // If the character is an operator, pop operators from the stack with higher or equal precedence and add them to the postfix expression
            else if (isOperator(c)) {
                while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(c)) {
                    postfixExpression.append(operatorStack.pop()).append(" ");
                }
                // Push the current operator onto the stack
                operatorStack.push(c);
            }
        }

        // Pop any remaining operators from the stack and add them to the postfix expression
        while (!operatorStack.isEmpty()) {
            postfixExpression.append(operatorStack.pop()).append(" ");
        }

        // Return the postfix expression
        return postfixExpression.toString().trim();
    }
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    private static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Postfix expression for '3 4 +': " + convert("3 + 4"));
        System.out.println("Postfix expression for '5 3 2 * + 4 -': " + convert("5 + 3 * 2 - 4"));
        System.out.println("Postfix expression for '(5 + 3) * 2': " + convert("(5 + 3) * 2"));
    }
}


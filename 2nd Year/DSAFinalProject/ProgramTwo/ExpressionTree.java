package DSAFinalProject.ProgramTwo;

import java.util.*; //WILDCARD
public class ExpressionTree {

    // CREATING A NODE FOR BINARY TREE
    static class TreeNode {
        String value;
        TreeNode left, right;

        // CONSTRUCTOR THAT INSERTS VALUE INSIDE THE NODE
        TreeNode(String value) {
            this.value = value;
        }
    }
    private TreeNode root; // CREATING THE ROOT OF THE TREE, SET NULL AS DEFAULT

    // CREATING VARIABLES USING HASHMAP THAT STORES THE KEY (VARIABLE) AND ITS VALUE
    private final Map<String, Integer> variables = new HashMap<>();

    // CONSTRUCTOR THAT SETS THE RETURN VALUE OF BUILDTREE() METHOD TO ROOT
    public ExpressionTree(String expression) {
        root = buildTree(expression);
    }

    //METHOD FOR CREATING AN EXPRESSION TREE
    private TreeNode buildTree(String expression) {

   	/* CREATES TWO STACKS, ONE IS FOR OPERANDS AND OPERATORS (NEEDED FOR STORING INTERNAL NODES AND ROOTS),
   	  AND THE OTHER ONE IS FOR OPERATORS ONLY*/
        Stack<TreeNode> stack = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int openParenthesesCount = 0; // FOR TRACKING OPEN PARENTHESIS
        boolean expectingOperand = true; // SETS TRUE IF THE NEXT VALID CHARACTER IS AN OPERAND
        // NESTED LOOP FOR READING AND CHECKING EACH CHARACTERS INSIDE THE EXPRESSION
        for (int i = 0; i < expression.length(); i++) {
            // STORES THE SINGLE CHARACTER (NUMBER/PARENTHESIS/VARIABLE/OPERATOR) OF EXPRESSION BASED ON CURRENT INDEX
            char character = expression.charAt(i);
            if (Character.isWhitespace(character)) continue; //SKIPS THE WHITESPACE

            if (character == '(') {
                openParenthesesCount++; // INCREMENTS THE OPEN PARENTHESIS COUNTER
                expectingOperand = true; // EXPECTING AN OPERAND AFTER AN OPENING PARENTHESIS
            }

            // THE CHARACTER IS VALID IF IT'S LETTER (VARIABLE) OR DIGIT (INTEGER)
            else if (Character.isLetterOrDigit(character)) {

                // IF THERE'S NO OPERATOR INSIDE THE PARENTHESIS "(3 3)", AN ERROR MESSAGE WILL DISPLAYED
                if (!expectingOperand) {
                    throw new IllegalArgumentException("Unexpected operand '" + character + "' without an operator.");
                }

                StringBuilder token = new StringBuilder();
               /* IF THE NUMBER CONTAINS MULTIPLE DIGITS (233, 10, 4000) OR MORE THAN 1 VARIABLE CHARACTERS (X1, X2, XY),
               	THEY NEED TO STICK TOGETHER TO AVOID SEPARATION */
                while (i < expression.length() && Character.isLetterOrDigit(expression.charAt(i))) {
                    token.append(expression.charAt(i++));
                }
                i--;
                String tokenStr = token.toString();

                // STORES THE VARIABLE TO THE HASHMAP CREATED
                if (Character.isLetter(tokenStr.charAt(0))) {
                    variables.putIfAbsent(tokenStr, 0); // Initialize variables to 0
                }
                stack.push(new TreeNode(tokenStr)); // PUSH THE NODE TO THE STACK
                expectingOperand = false; // AFTER AN OPERAND, AN OPERATOR OR CLOSING PARENTHESIS MUST EXPECTED
            }
            else if ("+-*/".indexOf(character) != -1) {

                // DISPLAYS AN ERROR IF THE PREVIOUS OPERATOR IS ALSO AN OPERATOR
                if (expectingOperand) {
                    throw new IllegalArgumentException("Unexpected operator '" + character + "' without a preceding operand.");
                }
                operators.push(character);// PUSH TO THE OPERATORS STACK
                expectingOperand = true; // AFTER AN OPERATOR, AN OPERAND MUST EXPECTED
            }
            else if (character == ')') {
                openParenthesesCount--; // DECREMENTS OPEN PARENTHESIS COUNTER IF THE CORRESPONDED CLOSING PARENTHESIS EXISTS
                if (openParenthesesCount < 0) {
                    // DISPLAYS AN ERROR IF THERE'S NO OPEN PARENTHESIS BEFORE HAVING A CLOSING PARENTHESIS
                    throw new IllegalArgumentException("Unmatched closing parenthesis found.");
                }
                // DISPLAYS AN ERROR IF THE EXPRESSION IS MALFORMED OR THERE'S MISSING OPEARATOR
                if (stack.size() < 2 || operators.isEmpty()) {
                    throw new IllegalArgumentException("Malformed expression or missing operator.");
                }
                TreeNode right = stack.pop(); // ASSIGNS THE POPPED STACK VALUE TO THE RIGHT LEAF OF A NODE
                TreeNode left = stack.pop(); // ASSIGNS THE POPPED STACK VALUE TO THE LEFT LEAF OF A NODE
                TreeNode operator = new TreeNode(String.valueOf(operators.pop())); // ASSIGNS THE OPERATOR TO THE INTERNAL NODE
                operator.left = left; // CONNECTS THE LEFT LEAF TO THE OPERATOR NODE
                operator.right = right; // CONNECTS THE RIGHT LEAF TO THE OPERATOR NODE
                stack.push(operator); // PUSH THE OPERATOR TO THE STACK SINCE THERE'S OTHER PARENTHESIS LEFT
                expectingOperand = false; // AFTER A CLOSING PARENTHESIS. AN OPERATOR OR ANOTHER PARENTHESIS MUST EXPECTED
            }
            else {
                // DISPLAYS AN ERROR IF THERE'S A CHARACTER OTHER THAN '+','-','*','/','(',')' INSIDE THE EXPRESSION
                throw new IllegalArgumentException("Invalid character '" + character + "' in expression.");
            }
        }
        // DISPLAYS AN ERROR IF THERE'S OPEN PARENTHESES THAT HAVEN'T CLOSED YET
        if (openParenthesesCount != 0) {
            throw new IllegalArgumentException("Unmatched opening parenthesis found.");
        }
        // DISPLAYS AN ERROR IF THERE'S A MALFORM IN THE EXPRESSION
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Malformed expression.");
        }

        // RETURNS THE LAST STACK VALUE AS THE ROOT OF THE TREE
        return stack.pop();
    }
    // METHOD THAT EVALUATES THE EXPRESSION
    public int evaluate(TreeNode node) {
        // IF THE BOTH LEFT AND RIGHT LEAF OF A NODE ARE NULL, THEN PROCEED
        if (node.left == null && node.right == null) {
            if (Character.isLetter(node.value.charAt(0))) {
                return variables.get(node.value); // IF THE CHARACTER IS A VARIABLE, THEN GET ITS INTEGER VALUE
            }
            return Integer.parseInt(node.value);  // CONVERTS THE STRING VALUE INTO AN INTEGER
        }
        int leftValue = evaluate(node.left); // USES RECURSION TO TRAVERSES DOWN TO THE LEFT LEAF OF A OPERATOR NODE
        int rightValue = evaluate(node.right); // USES RECURSION TO TRAVERSES DOWN TO THE RIGHT LEAF OF A OPERATOR NODE

        // RETURNS THE SUM, DIFFERENCE, PRODUCT, AND QUOTIENT OF LEFT AND RIGHT VALUE OF THE NODE BASED ON ITS SPECIFIC OPERATOR SYMBOL
        return switch (node.value) {
            case "+" -> leftValue + rightValue;
            case "-" -> leftValue - rightValue;
            case "*" -> leftValue * rightValue;
            case "/" -> leftValue / rightValue;
            default -> throw new IllegalArgumentException("Invalid operator: " + node.value);
        };
    }
    // METHOD FOR DISPLAYING THE EXPRESSION TREE BUT IN HORIZONTAL FORM
    public void displayTree(TreeNode node, int level) {
        if (node == null) return; //RETURNS BACK IF THERE"S NO NODE EXIST IN EITHER LEFT OR RIGHT
        displayTree(node.right, level + 1);
        System.out.println("  ".repeat(level) + node.value);
        displayTree(node.left, level + 1);
    }

    // DISPLAYS THE PREFIX NOTATION OF THE EXPRESSION THROUGH PRE-ORDER FORM (NODE-LEFT-RIGHT)
    public void generatePrefix(TreeNode node, StringBuilder result) {
        if (node == null) return;

        // THE VARIABLE IS REPLACED BY ITS VALUE IF USER UPDATES THE VALUE OF THE VARIABLE
        if(Character.isLetter(node.value.charAt(0)) && variables.get(node.value) != 0) {
            result.append(variables.get(node.value)).append(" ");
        }
        // DISPLAYS ONLY THE VARIABLE AFTER ENTERING THE EXPRESSION OR NOT UPDATING YET FROM DEFAULT VALUE (0)
        else result.append(node.value).append(" ");

        generatePrefix(node.left, result); // TRAVERSES UP TO THE LEFT LEAF OF THE NODE
        generatePrefix(node.right, result);
    }
    // DISPLAYS THE POSTFIX NOTATION OF THE EXPRESSION THROUGH POST-ORDER FORM (LEFT-RIGHT-NODE)
    public void generatePostfix(TreeNode node, StringBuilder result) {
        if (node == null) return;
        generatePostfix(node.left, result);
        generatePostfix(node.right, result);

        // THE VARIABLE IS REPLACED BY ITS VALUE IF USER UPDATES THE VALUE OF THE VARIABLE FROM DEFAULT VALUE OF 0
        if(Character.isLetter(node.value.charAt(0)) && variables.get(node.value) != 0) {
            result.append(variables.get(node.value)).append(" ");
        }
        // DISPLAYS ONLY THE VARIABLE AFTER ENTERING THE EXPRESSION OR NOT UPDATING YET FROM DEFAULT VALUE OF 0
        else result.append(node.value).append(" ");
    }

    // METHOD FOR UPDATING THE VALUE OF THE VARIABLE
    public void updateVariable(String var, int value) {
        if (variables.containsKey(var)) {
            variables.put(var, value); // UPDATES THE VALUE OF THE SPECIFIC KEY/VARIABLE
        } else {
            // DISPLAYS AN ERROR IF THE GIVEN VARIABLE DOESN'T EXIST
            throw new IllegalArgumentException("Variable " + var + " does not exist."); //
        }
    }
    // MAIN METHOD
    public static void main(String[] args) {
        // INSTATIATING THE SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fully parenthesized arithmetic expression: ");
        String expression = input.nextLine(); // ENTERS AN EXPRESSION

        try {
            ExpressionTree tree = new ExpressionTree(expression); // CREATES AN EXPRESSION TREE
            tree.interact(input); // REDIRECTS TO THE METHOD WHERE IT DISPLAYS RESULTS AND ENTERS YOUR UPDATED VALUES

        } catch (IllegalArgumentException e) {
            // GETS AND DISPLAYS THE ERROR MESSAGE FROM EVERY METHODS INSIDE THE CLASS
            System.out.println("\nError: " + e.getMessage());
        } finally {
            input.close(); // CLOSES THE SCANNER
        }
    }

    // METHOD FOR INTERACTING AND UPDATING THE VARIABLES FROM THE EXPRESSION TREE
    public void interact(Scanner input) {

        System.out.println("\nExpression Tree:");
        displayTree(root, 0); // CALLS THE METHOD TO DISPLAY THE EXPRRESSION TREE

        // INFINITE LOOP FOR CONTINUOUS UPDATE OF VALUES
        while (true) {
            // DISPLAYS PREFIX NOTATION BY CALLING ITS METHOD
            StringBuilder prefix = new StringBuilder();
            generatePrefix(root, prefix);
            System.out.println("\nPrefix Notation: " + prefix.toString().trim());

            // DISPLAYS POSTFIX NOTATION BY CALLING ITS METHOD
            StringBuilder postfix = new StringBuilder();
            generatePostfix(root, postfix);
            System.out.println("Postfix Notation: " + postfix.toString().trim());

            // DISPLAYS THE RESULT OF THE EXPRESSION
            System.out.println("\nRoot Value: " + evaluate(root));

            // IF THE EXPRESSION HAVE FIXED NUMBERS, THE PROGRAM ENDED
            if(variables.isEmpty()) {
                System.out.println("\n==========Program Terminated==========");
                break;
            }

            // IF YOU DON'T WANT TO UPDATE THE VARIABLES, THE PROGRAM ENDED
            System.out.print("\nWould you like to update variables? (Y/N): ");
            char choice = input.next().charAt(0);
            if (choice == 'N' || choice == 'n') {
                System.out.println("\n==========Program Terminated==========");
                break;
            }
            // LOOP THROUGH ALL VARIABLES FOR UPDATES
            System.out.println();
            for (String variable : variables.keySet()) {
                System.out.print("Enter new value for " + variable + " (or press Enter to skip): ");
                int value = input.nextInt();
                updateVariable(variable, value);
            }
        }
    }
}
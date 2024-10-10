public class ExpressionEvaluatorTest{
    public static void main(String [] args){
        String postfixExpression = "2 3 1 * + 9 -";
        int result = PostfixEvaluator.evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);
    }
}

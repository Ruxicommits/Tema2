
    import java.util.Stack;

    public class Main {

        public static void main(String[] args) {
            MyStack stack = new MyStack();

            // Evaluăm expresia postfixată
            String expr = "512 + 4 * + 3 -";
            int result = stack.evaluate(expr);

            // Output: -1 (rezultatul final al expresiei)
            System.out.println(result);
        }
    }

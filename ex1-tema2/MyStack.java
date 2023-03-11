import java.util.Stack;
public class MyStack {
    private Stack<Integer> stack;

    public MyStack() {
        this.stack = new Stack<>();
    }

    public void push(int value) {
        this.stack.push(value);
    }

    public int pop() {
        return this.stack.pop();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public int evaluate(String expr) {
        String[] tokens = expr.split("\\s+");
        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                // Dacă token-ul este o valoare numerică, îl adăugăm în stivă
                this.push(Integer.parseInt(token));
            } else {
                // Dacă token-ul este un operator, scoatem ultimele două numere din stivă și aplicăm operatorul
                int a = this.pop();
                int b = this.pop();
                switch (token) {
                    case "+":
                        this.push(b + a);
                        break;
                    case "-":
                        this.push(b - a);
                        break;
                    case "*":
                        this.push(b * a);
                        break;
                    case "/":
                        this.push(b / a);
                        break;
                }
            }
        }
        return this.pop(); // Returnăm rezultatul final
    }
}





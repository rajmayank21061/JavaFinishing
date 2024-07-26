import java.util.Stack;
public class checkParenthesis {
    // Function to check if brackets are balanced
    public static boolean isBalanced(String expr) {
        // Using a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the given expression to check matching brackets
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            // If the current character is an opening bracket, push it to the stack
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            // If the current character is a closing bracket, check if the stack is empty
            if (stack.isEmpty())
                return false;
            
                char check;
                check = stack.pop();
            // Pop the top element from the stack and check if it matches the current closing bracket
            switch (x) {
                case ')':
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                  
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // If the stack is empty, then the expression is balanced
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        // Test cases
        String expr1 = "([{}])";
        String expr2 = "([{}])(";
        String expr3 = "({[})";

        System.out.println("Expression: " + expr1 + " is " + (isBalanced(expr1) ? "Balanced" : "Not Balanced"));
        System.out.println("Expression: " + expr2 + " is " + (isBalanced(expr2) ? "Balanced" : "Not Balanced"));
        System.out.println("Expression: " + expr3 + " is " + (isBalanced(expr3) ? "Balanced" : "Not Balanced"));
    }
}

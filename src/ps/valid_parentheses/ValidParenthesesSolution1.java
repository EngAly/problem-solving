package ps.valid_parentheses;

import java.util.Stack;

public class ValidParenthesesSolution1 {

    public static void main(String[] args) {

        boolean isValid = isValid("{}{{}}{[]}()");
        System.out.println("isValid = " + isValid);
    }


    public static boolean isValid(String symbols) {

        Stack<Character> stack = new Stack<>();

        for (char symbol : symbols.toCharArray()) {

            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);

            } else if (symbol == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (symbol == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (symbol == ']' && stack.peek() == '[') {
                stack.pop();
            } else
                return false;
        }

        return true;
    }
}

package ps.generate_parenteses;


import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesSolution1 {


    public static void main(String[] args) {

        List<String> strings = new GenerateParenthesesSolution1().generateParenthesis(3);
        System.out.println("strings = " + strings);
    }

    public List<String> generateParenthesis(int n) {
        // Resultant list
        List<String> result = new ArrayList<>();
        /// Recursively generate parentheses
        generateParenthesis(result, "", 0, 0, n);
        return result;
    }

    private void generateParenthesis(List<String> result, String s, int open, int close, int n) {
        // Base case
        if (open == n && close == n) {
            result.add(s);
            return;
        }
        // If the number of open parentheses is less than the given n
        if (open < n) {
            generateParenthesis(result, s + "(", open + 1, close, n);
        }
        // If we need more close parentheses to balance
        if (close < open) {
            generateParenthesis(result, s + ")", open, close + 1, n);
        }
    }
}

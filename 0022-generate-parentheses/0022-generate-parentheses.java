import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        /**
         * Generates all combinations of n pairs of balanced parentheses.
         *
         * @param n The number of pairs of parentheses.
         * @return A list containing all valid combinations of parentheses.
         */
        List<String> result = new ArrayList<>();
        // Start the recursive generation with initial values
        generate(0, 0, n, "", result);
        return result;
    }

    private void generate(int open, int close, int n, String current, List<String> result) {
        if (open == close && open + close == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            generate(open + 1, close, n, current + '(', result);
        }
        if (close < open) {
            generate(open, close + 1, n, current + ')', result);
        }
    }
}
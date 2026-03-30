/**
 * =========================================================
 * MAIN CLASS - UseCase9RecursivePalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * @author HarshithKassetty
 * @version 9.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = checkString(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean checkString(String s, int start, int end) {

        // Base case: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return checkString(s, start + 1, end - 1);
    }
}
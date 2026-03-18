public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = checkString(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome
     */
    private static boolean checkString(String s, int start, int end) {

        // Base case: if pointers meet or cross
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkString(s, start + 1, end - 1);
    }
}
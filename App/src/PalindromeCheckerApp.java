/**
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string by removing spaces/symbols and converting
 * it to lowercase.
 *
 * @author Developer
 * @version 10.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Example input
        String input = "A man a plan a canal Panama";

        // Normalize: remove non-alphanumeric and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        // Two-pointer comparison
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Original Input : " + input);
        System.out.println("Normalized Input : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
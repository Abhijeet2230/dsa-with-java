package string;

/**
 * Problem: Valid Palindrome II
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 * Approach: Two-pointer technique with a single skip
 * Logic: Compare characters from start and end. If they differ, try two options:
 * 1. Skip the character at 'start' and check if the rest is a palindrome.
 * 2. Skip the character at 'end' and check if the rest is a palindrome.
 *
 * Time Complexity: O(n), where n is the length of string s.
 * Space Complexity: O(1).
 */
public class ValidPalindromeII {

    public static void main(String[] args) {
        String str = new String("abca");
        // Expected output: true (can delete 'b' or 'c')
        System.out.println("Can be a palindrome by deleting at most one character: " + validPalindrome(str));
    }

    /**
     * Main method to check if the string can be a palindrome with at most one deletion.
     */
    public static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        // Traverse the string from both ends
        while (start < end) {
            // If characters at both pointers do not match
            if (s.charAt(start) != s.charAt(end)) {
                // Try skipping either the character at start or the character at end
                // If either resulting substring is a palindrome, return true
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
            // If they match, move pointers inward
            start++;
            end--;
        }
        // If the loop completes, it means the string is already a palindrome
        return true;
    }

    /**
     * Helper method to check if a specific range of a string is a palindrome.
     * @param s The string to check
     * @param start Starting index of the range
     * @param end Ending index of the range
     * @return true if the substring in the range [start, end] is a palindrome
     */
    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            // If characters at start and end do not match, it's not a palindrome
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            // Move pointers inward
            start++;
            end--;
        }
        // The substring is a palindrome
        return true;
    }
}

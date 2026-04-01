package string;

/**
 * Problem: Backspace String Compare
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 *
 * Approach: Two-Pointer Technique (from end to start)
 * Time Complexity: O(n + m) where n and m are lengths of s and t.
 * Space Complexity: O(1) as we are not using extra space for processing.
 */
class BackspaceStringCompare {

    public static void main(String[] args) {
        // Test case: both should become "ac" after processing backspaces
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }

    /**
     * Compares two strings considering the '#' character as a backspace.
     */
    public static boolean backspaceCompare(String s, String t) {
        // Start from the end of both strings to handle backspaces naturally
        int i = s.length() - 1;
        int j = t.length() - 1;

        // Continue until both strings are fully processed
        while (i >= 0 || j >= 0) {

            // Find the next valid character index in string s
            // (skip characters that are deleted by backspaces '#')
            i = getNextCharIndex(s, i);
            
            // Find the next valid character index in string t
            j = getNextCharIndex(t, j);

            // If both pointers are at valid characters, compare them
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    // Mismatch found → strings are not equal after backspaces
                    return false;
                }
            }
            // If one string still has valid characters but the other doesn't, they aren't equal
            else if (i >= 0 || j >= 0) {
                return false;
            }

            // Move both pointers to the left to check the next valid characters
            i--;
            j--;
        }

        // All characters matched successfully
        return true;
    }

    /**
     * Helper method to find the index of the next valid character (not deleted by '#').
     * @param s The string to process
     * @param index Current position in the string
     * @return The index of the next character that would appear in the final string
     */
    public static int getNextCharIndex(String s, int index) {
        int skip = 0; // Tracks how many characters need to be skipped due to '#'

        while (index >= 0) {
            if (s.charAt(index) == '#') {
                // Found a backspace → increment the skip count
                skip++;
            } else if (skip > 0) {
                // Current character is deleted by a subsequent '#' → decrement skip and move on
                skip--;
            } else {
                // Found a character that will actually appear in the final output
                break;
            }
            // Move backwards in the string
            index--;
        }

        // Return the index of the next valid character (or -1 if we reached the beginning)
        return index;
    }
}

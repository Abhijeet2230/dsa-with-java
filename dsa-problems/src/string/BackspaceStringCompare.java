package string;

class BackspaceStringCompare {

    public static void main(String[] args) {
        // Test case: both should become "ac"
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }

    public static boolean backspaceCompare(String s, String t) {
        // Start from end of both strings
        int i = s.length() - 1;
        int j = t.length() - 1;

        // Continue until both strings are fully processed
        while (i >= 0 || j >= 0) {

            // Find next valid character index in both strings
            // (skip characters affected by backspaces '#')
            i = getNextCharIndex(s, i);
            j = getNextCharIndex(t, j);

            // If both pointers are valid, compare characters
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    // Mismatch found → strings are not equal
                    return false;
                }
            }
            // If one string still has characters but the other doesn't
            else if (i >= 0 || j >= 0) {
                return false;
            }

            // Move to next position (left side)
            i--;
            j--;
        }

        // All characters matched
        return true;
    }

    public static int getNextCharIndex(String s, int index) {
        int skip = 0; // Number of characters to skip due to backspaces

        while (index >= 0) {

            if (s.charAt(index) == '#') {
                // Found a backspace → increase skip count
                skip++;
            } else if (skip > 0) {
                // Skip this character (it is deleted by a previous '#')
                skip--;
            } else {
                // Found a valid character
                break;
            }

            index--;
        }

        // Return index of next valid character (or -1 if none)
        return index;
    }
}
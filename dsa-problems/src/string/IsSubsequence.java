package string;

/**
 * Problem: Is Subsequence
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) 
 * of the characters without disturbing the relative positions of the remaining characters.
 *
 * Approach: Two-pointer technique
 * Time Complexity: O(n), where n is the length of string t.
 * Space Complexity: O(1).
 */
public class IsSubsequence {

    public static void main(String[] args) {

       String s = "acb";
       String t = "ahbgdc";

        // Expected output: false (because 'c' comes before 'b' in s, but 'b' comes before 'c' in t)
        System.out.println(isSubsequence(s,t));
    }

    /**
     * Determines if string s is a subsequence of string t.
     * @param s The substring candidate
     * @param t The full string to search in
     * @return true if s is a subsequence of t, false otherwise
     */
    public static boolean isSubsequence(String s, String t) {
        // Pointer for string s
        int i = 0;
        // Pointer for string t
        int j = 0;

        // Iterate through both strings as long as there are characters left to compare
        while(i < s.length() && j < t.length()){
            // If characters match, move the pointer for string s (i) forward
            if(s.charAt(i) == t.charAt(j)){
                i++;
                // Always move the pointer for string t (j) forward regardless of match
                j++;
            } else {
                // If characters don't match, move the pointer for string t (j) forward only
                j++;
            }
        }

        // If i has reached the length of s, it means all characters of s were found in t in the correct order
        return i == s.length();
    }
}

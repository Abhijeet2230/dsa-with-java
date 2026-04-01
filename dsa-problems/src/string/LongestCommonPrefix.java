package string;

import java.util.Arrays;

/**
 * Problem: Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Approach: Sorting the strings
 * Logic: After sorting the array lexicographically, the first and last strings are the most different.
 * The longest common prefix for all strings must also be the common prefix for the first and last strings.
 *
 * Time Complexity: O(n log n * m), where n is number of strings and m is average length of string (due to sorting).
 * Space Complexity: O(1) beyond sorting space.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        // Expected output: "fl"
        System.out.print("Longest common prefix: " + longestCommonPrefix(strs));
    }

    /**
     * Finds the longest common prefix in an array of strings.
     * @param strs Array of strings
     * @return The common prefix or an empty string if none exists
     */
    public static String longestCommonPrefix(String[] strs) {
            // Sort the array of strings lexicographically
            Arrays.sort(strs);
            
            // The common prefix of all strings must be a common prefix of the first and last
            String first = strs[0];
            String last = strs[strs.length - 1];

            int i = 0;
            // Compare characters of the first and last strings
            while(i < first.length() && i < last.length()){
                if(first.charAt(i) == last.charAt(i)){
                    i++;
                } else {
                    // Mismatch found → break and return the common prefix up to this index
                    break;
                }
            }
            
            // Return the common prefix
            return first.substring(0, i);
        }
}

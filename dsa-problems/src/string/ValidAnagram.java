package string;

/**
 * Problem: Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
 *
 * Approach: Character Frequency Counter
 * Time Complexity: O(n), where n is the length of the strings.
 * Space Complexity: O(1) as the frequency array is of constant size (26 letters).
 */
public class ValidAnagram {

    public static void main(String[] args) {
        // Expected output: true
        System.out.println(isAnagram("anagram","nagrama"));
    }

    /**
     * Determines if two strings are anagrams of each other.
     */
    public static boolean isAnagram(String s, String t) {
            // If the strings have different lengths, they cannot be anagrams
            if(s.length() != t.length()){
                return false;
            }

            // Frequency array to track character counts for letters 'a' to 'z'
            int[] ch = new int[26];

            // Iterate through both strings simultaneously
            for(int i = 0; i < s.length(); i++){
                // Increment count for character in string s
                ch[s.charAt(i) - 'a']++;
                // Decrement count for character in string t
                ch[t.charAt(i) - 'a']--;
            }

            // If the strings are anagrams, every value in the frequency array should be zero
            for(int ele : ch){
                if(ele != 0){
                    // A non-zero value indicates a mismatch in character counts
                    return false;
                }
            }

            // All character counts balanced out to zero
            return true;
        }
}

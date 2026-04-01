package string;

/**
 * Problem: Ransom Note
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters 
 * from magazine and false otherwise. Each letter in magazine can only be used once in ransomNote.
 *
 * Approach: Character Frequency Array
 * Time Complexity: O(n + m), where n is length of ransomNote and m is length of magazine.
 * Space Complexity: O(1) as the frequency array is of constant size (26 letters).
 */
public class RansomNote {

    public static void main(String[] args) {
        // Expected output: true (two 'a's from 'aab')
        System.out.println(canConstruct("aa","aab"));
    }

    /**
     * Checks if ransomNote can be formed using letters from magazine.
     */
    public static boolean canConstruct(String ransomNote, String magazine) {

            // Frequency array to store counts of each letter from 'a' to 'z'
            int[] freq = new int[26];

            // Count character occurrences in the magazine string
            for(char c : magazine.toCharArray()){
                freq[c-'a']++;
            }

            // Iterate through the ransom note and check if each character is available
            for(char c : ransomNote.toCharArray()){
                // If a character's frequency is 0, it means it's not available or already used
                if(freq[c-'a'] == 0){
                    return false;
                }
                // Decrement the count as we use one character from the magazine
                freq[c-'a']--;
            }
            
            // All characters were found in sufficient quantity
            return true;
    }
}

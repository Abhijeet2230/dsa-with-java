package string;

/**
 * Problem: Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 * Vowels are 'a', 'e', 'i', 'o', and 'u', and they can be in both lower and upper cases.
 *
 * Approach: Two-pointer technique
 * Logic: Use two pointers, one at the start and one at the end, moving towards each other.
 * If both pointers point to a vowel, swap them.
 *
 * Time Complexity: O(n), where n is the length of string s.
 * Space Complexity: O(n) to store the result in a character array.
 */
class ReverseVowels {

    public static void main(String[] args) {
        // Expected output: "AceCreIm"
        System.out.println(reverseVowels("IceCreAm"));
    }

    /**
     * Reverses the vowels in the given string.
     */
    public static String reverseVowels(String s) {
        // Convert string to character array for in-place modifications
        char[] arr = s.toCharArray();
        
        int l = 0;              // Left pointer
        int r = arr.length - 1; // Right pointer

        while (l < r) {
            
            // Move the left pointer forward until a vowel is found
            while (l < r && !isVowel(arr[l])) {
                l++;
            }
            
            // Move the right pointer backward until a vowel is found
            while (l < r && !isVowel(arr[r])) {
                r--;
            }
            
            // Swap the vowels at the left and right pointers
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            // Move both pointers inward for the next comparison
            l++;
            r--;
        }
        
        // Return the modified character array as a string
        return new String(arr);
    }
    
    /**
     * Helper method to check if a character is a vowel.
     */
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

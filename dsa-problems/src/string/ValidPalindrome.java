package string;

/**
 * Problem: Valid Palindrome
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing 
 * all non-alphanumeric characters, it reads the same forward and backward.
 *
 * Approach: Normalization and Two-Pointer Comparison
 * Logic: First, build a string containing only lowercase alphanumeric characters.
 * Then, use two pointers to compare characters from start and end.
 *
 * Time Complexity: O(n), where n is the length of string s.
 * Space Complexity: O(n) to store the processed alphanumeric string.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // Expected output: true
        System.out.println("Is palindrome: " + isPalindrome(s));
    }

    /**
     * Checks if a string is a valid palindrome after processing it for alphanumeric characters.
     */
    public static boolean isPalindrome(String s) {
        // StringBuilder to store characters that are alphanumeric only
        StringBuilder sb = new StringBuilder();
        
        // Loop through the input string to filter characters
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            // Keep character if it's a letter or digit
            if(Character.isLetterOrDigit(ch)){
                // Add the lowercase version to normalize the case
                sb.append(Character.toLowerCase(ch));
            }
        }
        
        // Use two-pointer approach to verify if the processed string is a palindrome
        int start = 0;
        int end = sb.length() - 1;
        
        while(start < end){
            // If characters at both pointers don't match, it's not a palindrome
            if(sb.charAt(start) != sb.charAt(end)){
                return false;
            }
            // Move pointers towards the center
            start++;
            end--;
        }
        
        // The string is a palindrome
        return true;
    }
}

package string;

import java.util.Arrays;

/**
 * Problem: Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Approach: Two-pointer technique
 * Logic: Swap the first and last characters, then move pointers towards each other and repeat.
 *
 * Time Complexity: O(n), where n is the length of the character array.
 * Space Complexity: O(1) as we are performing swaps in-place.
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] st = {'h','e','l','l','o'};
        reverseString(st);
        // Expected output: [o, l, l, e, h]
        System.out.println("Reversed string: " + Arrays.toString(st));
    }

    /**
     * Reverses the given character array in-place.
     * @param s Character array to be reversed
     */
    public static void reverseString(char[] s) {
        // Pointer starting at the beginning
        int start = 0;
        // Pointer starting at the end
        int end = s.length - 1;

        // Continue swapping characters until pointers meet or cross
        while(start < end){
            // Use a temporary variable to swap characters at start and end indices
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            
            // Move pointers inward
            start++;
            end--;
        }
    }
}

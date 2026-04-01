package string;

import java.util.*;

/**
 * Problem: Group Anagrams
 * Given an array of strings, group the anagrams together.
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
 */
public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs)); // Output: [[eat, tea, ate], [bat], [tan, nat]]
        System.out.println(groupAnagrams2(strs)); // Output: [[eat, tea, ate], [bat], [tan, nat]]
    }

    /**
     * Approach 1: Using Sorting
     * Logic: Two words are anagrams if their sorted characters are the same.
     * Use the sorted word as a key in a HashMap.
     * 
     * Time Complexity: O(n * k log k), where n is the number of strings and k is the length of the longest string.
     * Space Complexity: O(n * k) for the HashMap.
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and list of original anagram strings as value
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert string to char array to sort
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            // Create a sorted string from the char array
            String sorted = new String(ch);
            
            // If the sorted key doesn't exist, create an empty list
            map.putIfAbsent(sorted, new ArrayList<>());
            // Add the original string s to the group corresponding to the sorted key
            map.get(sorted).add(s);
        }

        // Convert the map's collection of lists into a list of lists
        return new ArrayList<>(map.values());
    }

    /**
     * Approach 2: Using Character Frequency (Without sorting)
     * Logic: Two words are anagrams if their character counts (frequencies) are identical.
     * Use the frequency string as a key in a HashMap.
     *
     * Time Complexity: O(n * k), where n is number of strings and k is the max length of a string.
     * Space Complexity: O(n * k).
     */
    public static List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Get a unique key based on character frequencies
            String key = getKey(s);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    /**
     * Helper method to generate a unique key for anagram groups based on character frequency.
     * @param s Input string
     * @return String representation of the character counts (e.g., "[1, 0, 0, ..., 1]")
     */
    public static String getKey(String s) {
        // Frequency array for letters a-z
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Return the array's string representation as a unique key for the map
        return Arrays.toString(freq);
    }
}

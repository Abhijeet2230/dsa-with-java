package array;

import java.util.HashSet;

/**
 * Problem: Contains Duplicate
 * Given an integer array 'nums', return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainDuplicate {
    public static void main(String[] args) {
        // Example array with duplicates
        int []  arr = {1,2,3,4,5,6,7,7};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        // Use a HashSet to store elements we have seen so far
        HashSet<Integer> set= new HashSet<>();

        for(int ele : nums){
            // HashSet.add() returns false if the element already exists in the set
            if(!set.add(ele)){ 
                // Duplicate found
                return true;
            }
        }
        // No duplicates found after checking all elements
        return false;
    }
}

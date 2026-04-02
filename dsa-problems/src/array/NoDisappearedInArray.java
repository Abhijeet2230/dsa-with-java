package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Find All Numbers Disappeared in an Array
 * Given an array 'nums' of n integers where nums[i] is in the range [1, n], 
 * return an array of all the integers in the range [1, n] that do not appear in 'nums'.
 */
public class NoDisappearedInArray {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        // Using extra boolean array
        System.out.println(findDisappearedNumbers(arr));
    }

    /**
     * Approach 1: Using an auxiliary 'seen' array.
     * Marks each number encountered in a boolean array.
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {

            boolean[] seen = new boolean[nums.length + 1];
            List<Integer> result = new ArrayList<>();

            // Mark numbers that are present
            for (int num : nums) {
                seen[num] = true;
            }

            // Any index in 'seen' that is still false represents a missing number
            for (int i = 1; i <= nums.length; i++) {
                if (!seen[i]) {
                    result.add(i);
                }
            }

            return result;
    }

    /**
     * Approach 2: Constant extra space (excluding return list).
     * Mark visited indices by negating the value at that index.
     */
    public List<Integer> findDisappearedNumbers2(int[] nums) {

            List<Integer> result = new ArrayList<>();

            // Step 1: Iterate through the array and use the value as an index
            for(int i = 0; i < nums.length; i++){
                int index = Math.abs(nums[i]) - 1;

                // Mark the value at the calculated index as negative to indicate 'seen'
                if(nums[index] > 0){
                    nums[index] *=-1;
                }
            }

            // Step 2: Any index with a positive value was never visited
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > 0){
                    result.add(i + 1);
                }
            }

            return result;
    }
}

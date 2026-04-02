package array;

import java.util.Arrays;

/**
 * Problem: Two Sum II - Input Array Is Sorted
 * Given a 1-indexed array of integers 'numbers' that is already sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific 'target' number.
 */
public class TwoSumII {

    public static void main(String[] args) {
        int[] arr = {2,3,6};
        System.out.println("Indices (1-indexed): " + Arrays.toString(twoSum(arr,9)));
    }

    /**
     * Since the array is sorted, we can use two pointers starting from both ends.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum == target){
                // Found the pair, return 1-based indices
                return new int[] {start+1,end+1};
            }else if(sum>target){
                // Sum is too large, move end pointer to the left
                end--;
            }else{
                // Sum is too small, move start pointer to the right
                start++;
            }
        }
        return new int[] {};
    }
}

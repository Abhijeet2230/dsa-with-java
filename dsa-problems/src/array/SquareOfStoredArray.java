package array;

import java.util.Arrays;

/**
 * Problem: Squares of a Sorted Array
 * Given an integer array 'nums' sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquareOfStoredArray {
    public static void main(String[] args) {

        int[] arr = {-4, 1, 0, 2, 5};
        System.out.println("Sorted squares: " + Arrays.toString(sortedSquares(arr)));

    }

    public static int[] sortedSquares(int[] nums) {

        int index = 0;
        int[] result = new int[nums.length];
        // Step 1: Square each element
        for (int ele : nums) {
            result[index] = ele * ele;
            index++;
        }

        // Step 2: Sort the resulting array
        Arrays.sort(result);

        return result;
    }
}

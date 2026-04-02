package array;

import java.util.Arrays;

/**
 * Problem: Move Zeroes
 * Given an integer array 'nums', move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Must do this in-place without making a copy of the array.
 */
public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println("Original array: " + Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        // Pointer to keep track of the position for the next non-zero element
        int j = 0;
        for(int i =0;i<nums.length;i++){
            // If current element is non-zero, swap it with the element at position j
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

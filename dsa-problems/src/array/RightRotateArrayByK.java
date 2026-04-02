package array;

import java.util.Arrays;

/**
 * Problem: Rotate Array
 * Given an integer array 'nums', rotate the array to the right by 'k' steps, where 'k' is non-negative.
 */
public class RightRotateArrayByK {

    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7};
         rotate(arr,3);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    /**
     * To rotate the array by k steps:
     * 1. Reverse the entire array.
     * 2. Reverse the first k elements.
     * 3. Reverse the remaining n-k elements.
     */
    public static void rotate(int[] arr , int k){
        int n = arr.length;
        k=k%n; // Handle cases where k > n
        
        // Step 1: Reverse the whole array
        rev(arr,0,n-1);
        // Step 2: Reverse the first k elements
        rev(arr,0,k-1);
        // Step 3: Reverse the rest
        rev(arr,k,n-1);
    }

    /**
     * Helper method to reverse a portion of the array.
     */
    public static void rev(int[] arr, int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

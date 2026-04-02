package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem: Reverse Array
 * Given an array, the task is to reverse the array in-place.
 */
public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input elements
        for(int i =0 ;i<size;i++){
            System.out.println("Enter the elements");
            arr[i]=sc.nextInt();
        }

        // Reverse the array
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
        sc.close();
    }

    /**
     * Reverses the array using two pointers starting from both ends.
     */
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        // Swap elements at 'start' and 'end' and move pointers inward
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}

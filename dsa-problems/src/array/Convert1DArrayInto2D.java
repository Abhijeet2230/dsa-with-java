package array;

import java.util.Arrays;

/**
 * Problem: Convert 1D Array Into 2D Array
 * You are given a 1D array 'original' and two integers 'm' and 'n'. 
 * You are tasked with creating a 2D array with 'm' rows and 'n' columns using all the elements from 'original'.
 */
public class Convert1DArrayInto2D {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // Convert to 2x2 2D array
        System.out.println(Arrays.deepToString(construct2DArray(arr,2,2)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        // Check if the 1D array can exactly fill the 2D array
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        int k = 0;
        // Iterate through each row and column to fill the 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[k];
                k++;
            }
        }

        return result;
    }
}

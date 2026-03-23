package array;

import java.util.Arrays;

public class Convert1DArrayInto1D {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.deepToString(construct2DArray(arr,2,2)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[k];
                k++;
            }
        }

        return result;

    }

}

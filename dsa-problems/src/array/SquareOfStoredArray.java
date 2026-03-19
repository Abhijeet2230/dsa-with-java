package array;

import java.util.Arrays;

public class SquareOfStoredArray {
    public static void main(String[] args) {


        int[] arr = {-4,1,0,2,5};
        System.out.println(Arrays.toString(sortedSquares(arr)));

    }
        public static int[] sortedSquares(int[] nums) {
            int index = 0;
            int[] result = new int[nums.length];
            for(int ele : nums){
                result[index]=ele*ele;
                index++;
            }

            Arrays.sort(result);

            return result;


        }
    }

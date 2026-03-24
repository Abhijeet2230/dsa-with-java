package array;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {

        int[] arr = {2,3,6};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    //Input array is sorted
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum == target){
                return new int[] {start+1,end+1};
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[] {};
    }
}

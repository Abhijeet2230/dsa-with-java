package array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates(arr));
//        System.out.println(Arrays.toString(arr));
//        System.out.println();
        System.out.println(removeDuplicates2(arr));
    }


    //This return the count of duplicate, and arrays starting element should be unique.
    //This is leetcode method
    public static int removeDuplicates(int[] nums) {

            int j = 1;
            for(int i =1;i<nums.length;i++){
                if(nums[i]!=nums[j-1]){
                    nums[j]=nums[i];
                    j++;
                }
            }
            return j;

    }

    //This method returns the unique arraylist but removing duplicate method
    public static ArrayList<Integer> removeDuplicates2(int[] arr) {
        // code here
        ArrayList<Integer> answer = new ArrayList<Integer>();

        int j = 0;

        answer.add(arr[0]);

        for(int i=1;i<arr.length;i++ ){
            if(arr[j]!=arr[i]){
                answer.add(arr[i]);
                j=i;
            }
        }
        return answer;
    }
}

package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem: Remove Duplicates from Sorted Array
 * Given a sorted array 'nums', remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 */
public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("New length: " + removeDuplicates(arr));
        System.out.println("Unique elements in ArrayList: " + removeDuplicates2(arr));
    }


    /**
     * Approach 1: Two Pointers (In-place)
     * Returns the count of unique elements and modifies the input array.
     */
    public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            // 'j' points to the position where the next unique element should be placed
            int j = 1;
            for(int i =1;i<nums.length;i++){
                // If the current element is different from the previous unique element
                if(nums[i]!=nums[j-1]){
                    nums[j]=nums[i];
                    j++;
                }
            }
            return j;

    }

    /**
     * Approach 2: Using an ArrayList
     * Returns an ArrayList containing only the unique elements.
     */
    public static ArrayList<Integer> removeDuplicates2(int[] arr) {
        if (arr.length == 0) return new ArrayList<>();
        
        ArrayList<Integer> answer = new ArrayList<Integer>();

        int j = 0;
        answer.add(arr[0]);

        for(int i=1;i<arr.length;i++ ){
            // If the current element is different from the last added unique element
            if(arr[j]!=arr[i]){
                answer.add(arr[i]);
                j=i;
            }
        }
        return answer;
    }
}

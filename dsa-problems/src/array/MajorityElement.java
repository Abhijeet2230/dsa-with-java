package array;

import java.util.Arrays;

/**
 * Problem: Majority Element
 * Given an array 'nums' of size n, find the majority element.
 * The majority element is the element that appears more than floor(n/2) times.
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        // Using sorting approach
        System.out.println(majorityElement(arr));

        // Using Boyer-Moore Voting algorithm
        System.out.println(majorityElement2(arr));
    }


    /**
     * Approach 1: Using Sorting
     * If the array is sorted, the majority element will always be present at index n/2.
     * This implementation counts occurrences to verify.
     */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int major = nums.length / 2;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > major) {
                return nums[i];
            }
        }
        return nums[0];
    }


    /**
     * Approach 2: Boyer-Moore Voting Approach
     * This algorithm finds the majority element in O(n) time and O(1) space.
     * It works by maintaining a candidate and a count.
     */
    public static int majorityElement2(int[] nums){

        int count =0;
        int ans = 0;

        for(int i : nums){
            // If count is zero, pick the current element as the new candidate
            if(count ==0){
                ans=i;
            }

            // Increment count if current element is the candidate, else decrement
            if(ans==i) {
                count++;
            }else {
                count--;
            }
        }
        return ans;
    }
}

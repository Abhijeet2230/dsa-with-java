package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem: Two Sum
 * Given an array of integers 'nums' and an integer 'target', return indices of the two numbers 
 * such that they add up to 'target'.
 * Leetcode: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,9,11,7};
        // Using HashMap approach
        System.out.println("Optimal approach indices: " + Arrays.toString(twoSum(arr,9)));
        // Using Brute Force approach
        System.out.println("Brute force indices: " + Arrays.toString(bruteForceTwoSum(arr,9)));
    }

    /**
     * Approach 1: Using HashMap (Optimal)
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] twoSum(int[] arr, int target){
        // map stores: value -> index
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int remaining = target - arr[i];

            // If the complement (target - current) exists in the map, we found the pair
            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining),i};
            }

            // Store the current number and its index in the map
            map.put(arr[i],i);
        }

        return new int[] {};
    }

    /**
     * Approach 2: Brute Force
     * Check every possible pair.
     * Time Complexity: O(n^2)
     */
    public static int[] bruteForceTwoSum(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j]== target ){
                   return new int[] {i,j};
                }
        }
        return new int[] {};
    }
}

package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem: 3Sum
 * Given an integer array 'nums', return all the triplets [nums[i], nums[j], nums[k]] 
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * The solution set must not contain duplicate triplets.
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("Triplets that sum to zero: " + threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> ans = new ArrayList<>();
        // Step 1: Sort the array to use two-pointer technique and easily skip duplicates
        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            // Skip duplicate values for the first element of the triplet
            if(i!=0 && nums[i]==nums[i-1]) continue;

            int j = i+1;
            int k = nums.length-1;

            // Step 2: Use two pointers (j and k) to find the remaining two elements
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    // Found a triplet
                    ans.add(Arrays.asList(nums[i],nums[j++],nums[k--]));

                    // Skip duplicate values for the second element
                    while (j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    // Skip duplicate values for the third element
                    while (j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(sum<0){
                    // Sum is too small, move left pointer to the right
                    j++;
                }else{
                    // Sum is too large, move right pointer to the left
                    k--;
                }
            }
        }
        return ans;
    }
}

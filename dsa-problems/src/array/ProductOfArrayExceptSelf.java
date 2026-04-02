package array;

import java.util.Arrays;

/**
 * Problem: Product of Array Except Self
 * Given an integer array 'nums', return an array 'answer' such that answer[i] 
 * is equal to the product of all the elements of 'nums' except nums[i].
 * The algorithm must run in O(n) time and without using the division operation.
 */
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println("Brute force: " + Arrays.toString(productOfArray(arr)));
        System.out.println("Optimal: " + Arrays.toString(productExceptSelf(arr)));
    }

    /**
     * Approach 1: Brute Force
     * For each element, iterate through all other elements to calculate the product.
     * Time Complexity: O(n^2)
     */
    public static int[] productOfArray(int[] nums){

        int[] ans = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ans[i] = 1;
            for (int j = 0 ;j<nums.length;j++){
                if(i==j) continue;
                ans[i]*=nums[j];
            }
        }

        return ans;
    }

    /**
     * Approach 2: Left and Right Products (Optimal)
     * Calculate the product of all elements to the left and all elements to the right of each index.
     * Time Complexity: O(n)
     */
    public static int[] productExceptSelf(int[] nums){

        int[] answer = new int[nums.length];
        
        // Step 1: Calculate prefix products (product of all elements to the left of i)
        answer[0] = 1; 
        for (int i = 1;i < nums.length;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }

        // Step 2: Calculate suffix products and multiply with the prefix products
        int suffix = 1;
        for (int i = nums.length-1;i>=0;i--){
            answer[i] = answer[i] * suffix;
            suffix*=nums[i];
        }
        return answer;

    }
}

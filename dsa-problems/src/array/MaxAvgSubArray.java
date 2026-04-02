package array;

/**
 * Problem: Maximum Average Subarray I
 * Given an array 'nums' consisting of n integers and an integer 'k', 
 * find a contiguous subarray whose length is equal to 'k' that has the maximum average value and return this value.
 */
public class MaxAvgSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        // Using sliding window approach
        System.out.println(findMaxArray1(arr, 4));
        // Using brute force approach
        System.out.println(findMaxArray(arr, 4));
    }

    /**
     * Approach 1: Sliding Window
     * This approach calculates the sum of the first 'k' elements and then slides the window 
     * by adding the next element and removing the first element of the previous window.
     */
    public static double findMaxArray1(int[] nums, int k) {

        int sum = 0;
        // Calculate the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        // Slide the window from k to the end of the array
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];      // Add the next element
            sum -= nums[i - k];  // Remove the leftmost element

            // Update maxSum if the current window sum is greater
            maxSum = Math.max(maxSum, sum);
        }

        // Maximum average = maximum sum / k
        return (double) maxSum / k;
    }

    /**
     * Approach 2: Brute Force
     * Calculates the sum for every possible subarray of size k.
     */
    public static double findMaxArray(int[] nums, int k) {
        double maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k; // Fixed the hardcoded '4' to 'k'
    }
}

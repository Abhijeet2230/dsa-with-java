package array;

public class MaxAvgSubArray {
    public static void main(String[] args) {

        int[] arr = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxArray1(arr, 4));
        System.out.println(findMaxArray(arr, 4));
    }

    public static double findMaxArray1(int[] nums, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    //brute force approach
    public static double findMaxArray(int[] nums, int k) {
        double maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / 4;
    }
}

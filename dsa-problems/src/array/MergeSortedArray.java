package array;

import java.util.Arrays;

/**
 * Problem: Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * nums1 has enough space (m + n) to hold elements from both arrays.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        // nums1 has extra space (0s) to accommodate nums2
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start merging from the end of both arrays to avoid overwriting elements in nums1
        int i = m - 1;          // Last valid element in nums1
        int j = n - 1;          // Last element in nums2
        int k = m + n - 1;      // Last position in nums1

        while (i >= 0 && j >= 0) {
            // Compare elements from the end and place the larger one at the last available position
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        // (elements remaining in nums1 are already in their correct positions)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

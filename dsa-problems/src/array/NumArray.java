package array;

/**
 * Problem: Range Sum Query - Immutable
 * Given an integer array 'nums', handle multiple queries of the sum of elements 
 * between indices 'left' and 'right' inclusive.
 */
public class NumArray {
        // prefix[i] stores the sum of elements from nums[0] to nums[i]
        int[] prefix;

        public NumArray(int[] nums) {
            int n = nums.length;
            prefix = new int[n];
            if (n > 0) {
                prefix[0] = nums[0];
                // Precompute the prefix sums
                for(int i = 1;i<n;i++){
                    prefix[i]=prefix[i-1]+nums[i];
                }
            }
        }

        /**
         * Returns the sum of the elements of nums between indices left and right inclusive.
         * The formula is: sumRange(i, j) = prefix[j] - prefix[i-1]
         */
        public int sumRange(int left, int right) {
            // If left is 0, the sum is simply the prefix sum at 'right'
            if(left == 0) return prefix[right];

            return prefix[right]-prefix[left-1];
        }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
}

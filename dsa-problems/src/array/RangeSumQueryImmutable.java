package array;

/**
 * Demo class for Range Sum Query Immutable (NumArray)
 */
public class RangeSumQueryImmutable {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        // Instantiate the NumArray object which precomputes prefix sums
        NumArray numArray = new NumArray(nums);
        // Query the sum of elements from index 1 to 3
        System.out.println(numArray.sumRange(1,3));
    }
}

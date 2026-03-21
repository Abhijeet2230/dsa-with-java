package array;


public class RangeSumQueryImmutable {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(1,3));
    }
}




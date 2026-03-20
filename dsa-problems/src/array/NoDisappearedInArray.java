package array;

import java.util.ArrayList;
import java.util.List;

public class NoDisappearedInArray {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }

    //By using another seen array
    public static List<Integer> findDisappearedNumbers(int[] nums) {

            boolean[] seen = new boolean[nums.length + 1];
            List<Integer> result = new ArrayList<>();

            for (int num : nums) {
                seen[num] = true;
            }

            for (int i = 1; i <= nums.length; i++) {
                if (!seen[i]) {
                    result.add(i);
                }
            }

            return result;
    }

    //Without using another array
    public List<Integer> findDisappearedNumbers2(int[] nums) {

            List<Integer> result = new ArrayList<>();

            // Step 1: Mark visited indices as -1
            for(int i = 0; i < nums.length; i++){
                int index = Math.abs(nums[i]) - 1;

                if(nums[index] > 0){
                    nums[index] *=-1;
                }
            }

            // Step 2: Find missing numbers
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > 0){
                    result.add(i + 1);
                }
            }

            return result;
    }


}

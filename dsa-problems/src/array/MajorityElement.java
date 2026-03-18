package array;

import java.util.Arrays;

//leetcode : https://leetcode.com/problems/majority-element/

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));

        System.out.println(majorityElement2(arr));
    }


    //Using sorting
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int major = nums.length / 2;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > major) {
                return nums[i];
            }
        }
        return nums[0];
    }


    //Boyer moore's voting approach
    public static int majorityElement2(int[] nums){

        int count =0;
        int ans = 0;

        for(int i : nums){

            if(count ==0){
                ans=i;
            }

            if(ans==i) {
                count++;
            }else {
                count--;
            }
        }
        return ans;
    }
}
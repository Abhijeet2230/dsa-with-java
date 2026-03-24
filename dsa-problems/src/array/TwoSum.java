package array;

import java.util.Arrays;
import java.util.HashMap;

//leetcode = https://leetcode.com/problems/two-sum/
//TwoSum

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,9,11,7};

        System.out.println(Arrays.toString(twoSum(arr,9)));
        System.out.println(Arrays.toString(bruteForceTwoSum(arr,9)));
    }


    public static int[] twoSum(int[] arr, int target){

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i = 0;i<arr.length;i++){
            int remaining = target - arr[i];

            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining),i};
            }

            map.put(arr[i],i);
        }

        return new int[] {};

    }

    public static int[] bruteForceTwoSum(int[] nums, int target) {

        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j]== target ){
                   return new int[] {i,j};
                }
        }
        return new int[] {};
    }
}

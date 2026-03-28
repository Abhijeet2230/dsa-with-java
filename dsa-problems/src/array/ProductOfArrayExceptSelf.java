package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productOfArray(arr)));
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    //Brute force approach
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


    public static int[] productExceptSelf(int[] nums){

        int[] answer = new int[nums.length];
        answer[0] = 1; //This prefix product

        int left = 1;
        for (int i = 1;i < nums.length;i++){
            //answer [i] = left;
            answer[i]=answer[i-1]*nums[i-1];
            //left*=nums[i];
        }

        int suffix = 1;

        for (int i = nums.length-1;i>=0;i--){
            answer[i] = answer[i] * suffix;
            suffix*=nums[i];
        }
        return answer;

    }
}

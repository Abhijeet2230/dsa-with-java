package array;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr,1));
    }

    public static int threeSumClosest(int[] nums,int target){

        int closestSum = nums[0]+ nums[1]+nums[2];
        for (int i = 0 ; i<nums.length-2;i++){
            int j = i+1;
            int k =  nums.length-1;
            while (j<k){
                int sum = nums[i]+ nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                    closestSum = sum;
                }

                if(sum<target) j++;
                else if(sum>target) k--;
                else return sum;

            }
        }

        return closestSum;

    }
}

package array;

/**
 * Problem: 3Sum Closest
 * Given an integer array 'nums' and an integer 'target', find three integers in 'nums' 
 * such that the sum is closest to 'target'. Return the sum of the three integers.
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        System.out.println("Sum closest to target: " + threeSumClosest(arr,1));
    }

    public static int threeSumClosest(int[] nums,int target){

        // Initialize closestSum with the sum of the first three elements
        int closestSum = nums[0]+ nums[1]+nums[2];
        
        for (int i = 0 ; i<nums.length-2;i++){
            int j = i+1;
            int k =  nums.length-1;
            
            // Use two pointers to find the closest sum for the current 'i'
            while (j<k){
                int sum = nums[i]+ nums[j]+nums[k];
                
                // If the current sum is closer to the target than our previous closest sum, update it
                if(Math.abs(target-sum)<Math.abs(target-closestSum)){
                    closestSum = sum;
                }

                if(sum<target) {
                    // Sum is less than target, move left pointer to increase sum
                    j++;
                } else if(sum>target) {
                    // Sum is greater than target, move right pointer to decrease sum
                    k--;
                } else {
                    // If sum exactly equals target, it's the closest possible sum
                    return sum;
                }
            }
        }

        return closestSum;
    }
}

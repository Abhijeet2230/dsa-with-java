package array;

/**
 * Problem: Container With Most Water
 * Given an array 'height' where height[i] represents the height of a vertical line at index i.
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        // Example heights
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length-1;

        // Use two pointers starting from both ends
        while(start<end){
            int currMax = 0;

            // The amount of water is limited by the shorter line
            if(height[start]<=height[end]){
                // Area = height * width
                currMax = height[start]*(end-start);
                // Move the pointer pointing to the shorter line inward
                start++;
            }else{
                currMax = height[end]*(end-start);
                end--;
            }
            // Update the global maximum area found so far
            max = Math.max(max,currMax);
        }
        return max;
    }
}

package array;

/**
 * Problem: Binary Search
 * Given a sorted array of integers 'nums' and a 'target' value, return the index of 'target' if it exists.
 * If it doesn't exist, return -1.
 */
public class BinarySearch {

    public static void main(String[] args) {
        // Example sorted array
        int[] arr = {-1,0,3,5,9,12};
        // Search for target value 9
        System.out.println(search(arr,9));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        // Use two pointers to narrow down the search range
        while (low <= high){
            // Calculate mid index safely to avoid overflow
            int mid = low + (high - low)/2;

            // If target is found at mid, return mid index
            if(target == nums[mid]){
                return mid;
            }
            // If target is smaller than mid element, search in the left half
            if(target < nums[mid]){
                high = mid-1;
            }else{
                // If target is larger than mid element, search in the right half
                low = mid +1;
            }
        }
        // Target not found
        return -1;
    }
}

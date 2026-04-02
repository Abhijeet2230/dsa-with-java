package array;

/**
 * Problem: Remove Element
 * Given an integer array 'nums' and an integer 'val', remove all occurrences of 'val' in 'nums' in-place.
 * The order of the elements may be changed. Then return the number of elements in 'nums' which are not equal to 'val'.
 */
public class RemoveElements {

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        // Remove all 2s from the array
        System.out.println("New length: " + removeElement(arr,2));
    }

    public static int removeElement(int[] nums, int val) {
        // 'k' tracks the position to place the next element that is NOT 'val'
        int k =0;

        for(int i =0;i<nums.length;i++){
            // If the current element is not the target value, move it to index 'k'
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        // 'k' is the count of elements that are not equal to 'val'
        return k;
    }
}

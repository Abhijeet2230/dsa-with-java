package array;

import java.util.Arrays;

/**
 * Problem: Merge Sort
 * A divide and conquer algorithm that sorts an array by recursively dividing it into halves, 
 * sorting each half, and then merging them back together.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }

    // Recursively divide the array into two halves
    public static void mergeSort(int[] arr, int low, int high){
        if (low>=high){
            return ;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr,low,mid);        // Sort the left half
        mergeSort(arr,mid+1,high);     // Sort the right half
        merge(arr,low,mid,high);       // Merge the sorted halves

    }

    // Merge two sorted subarrays into a single sorted subarray
    public static void merge(int[] arr,int low,int mid, int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int i = 0;
        
        // Compare elements from both halves and add the smaller one to temp array
        while (left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i++]=arr[left++];
            }else {
                temp[i++]=arr[right++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (left<=mid){
            temp[i++]=arr[left++];
        }

        // Copy remaining elements from the right half, if any
        while (right<=high){
            temp[i++]=arr[right++];
        }

        // Copy elements from temp array back to the original array
        for (int j = low;j<=high;j++){
            arr[j] = temp[j - low];
        }
    }
}

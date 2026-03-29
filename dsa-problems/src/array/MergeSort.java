package array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,6,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }

    public static void mergeSort(int[] arr, int low, int high){
        int mid = low + (high - low) / 2;
        if (low>=high){
            return ;
        }
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }

    public static void merge(int[] arr,int low,int mid, int high){
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int i = 0;
        while (left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i++]=arr[left++];
            }else {
                temp[i++]=arr[right++];
            }
        }

        while (left<=mid){
            temp[i++]=arr[left++];
        }

        while (right<=high){
            temp[i++]=arr[right++];
        }


        for (int j = low;j<=high;j++){
            arr[j] = temp[j - low];
        }
    }
}


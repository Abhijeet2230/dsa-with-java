package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];


        for(int i =0 ;i<size;i++){
            System.out.println("Enter the elements");
            arr[i]=sc.nextInt();
        }

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}

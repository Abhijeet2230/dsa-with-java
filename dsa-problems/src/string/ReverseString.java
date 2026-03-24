package string;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        char[] st = {'h','e','l','l','o'};
        reverseString(st);
        System.out.println(Arrays.toString(st));
    }

    public static void reverseString(char[] s) {
        int start = 0 ;
        int end = s.length-1;

        while(start<end){
            char temp = s[end];
            s[end]=s[start];
            s[start]=temp;
            start++;
            end--;
        }
    }
}

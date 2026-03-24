package array;

import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {

        int []  arr = {1,2,3,4,5,6,7,7};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set= new HashSet<>();

//            for(int ele : nums){
//                if(set.contains(ele)){
//                    return true;
//                }
//                set.add(ele);
//            }
//            return false;

            for(int ele : nums){
                if(!set.add(ele)){ // add returns true if successfully added, if the element already present inside the
                                   // set it returns false and wont add that element. Set wont allow duplicate
                    return true;
                }
            }
            return false;
        }
    }


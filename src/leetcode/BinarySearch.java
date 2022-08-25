package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int [] num = {0,3,43,56,57, 59,66,567,2342,54321,109897,1000000};
        int target = 2342;

        System.out.println(findBinary(num, target));

    }

     static int findBinary(int[] num, int target) {
        int start = 0;
        int end = num.length -1;


        for (int i =0; i < num.length; i++){
            int mid = (start+end)/2;
            if (target < num[mid]){ //mid = 66 4
                end = mid-1;
            }
            else if(target > num[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }


         return  -1;

    }
}

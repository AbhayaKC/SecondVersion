package leetcode;

import java.util.Arrays;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] num = {1,4,5,7,8,10,10,10,10,10,10,14,19,22,25,25,45};
    int target = 15;
        System.out.println((celingNumber(num,target)));


    }
    static int celingNumber(int [] num, int target){
        int ans = -1;
        int start = 0;
        int end = num.length -1;
       while (start <= end){
           int mid = (start +end)/2;

           if(target == num[mid]){
               ans = mid;
               start = mid +1;
           } else if (target< num[mid]) {
               end = mid -1;
           }else{
               start = mid +1;
           }
       }

        return ans;

    }
}

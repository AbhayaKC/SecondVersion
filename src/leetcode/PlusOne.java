package leetcode;

import java.util.Arrays;

public class PlusOne{
    public static void main(String[] args) {

        int[] num = {3,9};
        System.out.println(Arrays.toString(plusOne(num)));

        }


    static int[] plusOne(int[] num){
        if (num.length==1 && num[0] == 9){
            return  new int[]{1,0};
        }if (num.length==1 && num[0] != 9){
            return new int [] {num[0]+= 1};
        }else

        for (int i = num.length -1; i >num.length; i--){

            if (num[i] == 9){
                num[i] =0;
            }
            else {
                num[i] += 1;
                return num;
            }

        }
        return num;
    }
}
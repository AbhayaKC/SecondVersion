package com.infosys;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
    int [] num = {0,3,5,4,1};
        System.out.println(missingNumber(num));
    }

    static int missingNumber(int [] num){
       
        for (int i =0;i < num.length; i++){
            if (i != num[i] ){
                return i;
            }
        }
        return -1;
    }

}


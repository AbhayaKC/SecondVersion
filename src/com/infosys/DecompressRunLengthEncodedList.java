package com.infosys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
    int[] nums = {1,2,4,5};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

        static int[] decompressRLElist(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for(int i=0 ; i< nums.length-1 ; i+=2){
                int freq = nums[i] ;
                while(freq >0){
                    list.add(nums[i+1]);
                    freq -- ;
                }
            }
            int[] out = new int[list.size()];
            for(int i =0 ; i< list.size(); i++){
                out[i] = list.get(i) ;
            }
            return out ;

        }

}

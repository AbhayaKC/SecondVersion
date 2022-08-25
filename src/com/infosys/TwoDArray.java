package com.infosys;

import java.util.*;

public class TwoDArray {
    public static int maximumWealth(int[][] accounts) {


        int highest = 0;
        int sum =0;
      
        for (int i =0 ; i < accounts.length ; i ++){
            for(int j = 0 ; j < accounts[i].length; j ++){
                sum += accounts[i][j];
            }
            if(sum>highest){
                highest = sum;
            }
            sum = 0;
        }
        return highest;
    }

    public static void main(String[] args) {

        int [] []accounts = {{1,5},{7,3},{3,5}};

        System.out.println(maximumWealth(accounts));

    }
}

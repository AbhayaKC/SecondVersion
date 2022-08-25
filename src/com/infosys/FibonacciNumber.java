package com.infosys;

public class FibonacciNumber {
    public static void main(String[] args) {
        // 0 1  1 2 3 5 8 13 21
        int result = 0 ;
        int firstNum =0;
        int secondNum = 1;
        System.out.println( firstNum);
        System.out.println(secondNum);
        while (result < 100){

            result = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = result;
            System.out.println(result);
        }
    }
}

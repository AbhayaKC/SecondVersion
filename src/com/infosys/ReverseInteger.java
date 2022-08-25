package com.infosys;

public class ReverseInteger {
    public static void main(String[] args) {
       // System.out.println(reversed(1009));
        System.out.println(isPalindrome(-1001));

    }

    private static int reversed(int originalNumber) {
        int reversed = 0;
        while(originalNumber != 0){
            reversed = reversed * 10 + originalNumber % 10;
            originalNumber/= 10;
        }
        return reversed;
    }
    static boolean isPalindrome(int x) {
        //1234325 is a palindorme

        int reversedX = 0; //5
        int copyOfX= x;

        while(copyOfX != 0){
            reversedX = (reversedX * 10) + copyOfX%10;
            copyOfX /= 10;

        }
        if(reversedX == x){
            return true;
        }
        return false;

    }


}

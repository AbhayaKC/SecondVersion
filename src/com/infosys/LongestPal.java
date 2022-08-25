package com.infosys;

public class LongestPal {
    public static void main(String[] args) {
        String originialWord = "teslaaaaalut";
        System.out.println(longestpalindrome(originialWord));
    }
    static String longestpalindrome(String s){
        String longestPal = "";

        for (int i = 0; i < s.length();i++){
            String reversedOgString = "";
            for (int j = i; j < s.length(); j++ ){
                 reversedOgString += s.charAt(j);
                if (isPaldinrome(reversedOgString) && reversedOgString.length() > longestPal.length()){
                    longestPal = reversedOgString;
                }
            }

        }
        return longestPal;
    }
    static boolean isPaldinrome(String s){
        boolean isPal = false;
        String reversed = "";
        for (int i =s.length()-1; i >=0; i--){
            reversed+= s.charAt(i);
        }
        if (reversed.equals(s)) {
            isPal =true;
        }
         return isPal;
    }
}

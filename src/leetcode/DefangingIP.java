package leetcode;

public class DefangingIP {
    public static void main(String[] args) {

    }
    static String longestPalindrome(String s) {

        int start = 0;
        int end = s.length()-1;

        String current ;
        String longest = null;

        while (start < end) {
            while(s.charAt(start) != s.charAt(end)){
                start++;
                end --;
                if(s.charAt(start) == s.charAt(end)){
                    current = String.valueOf(s.charAt(start) + s.charAt(end));
                    if(current.length() > longest.length()){
                        longest = current;
                    }
                }
            }

        }
        return longest;
    }
}

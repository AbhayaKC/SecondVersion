package leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
    String s = "Hello world hehehe adf adf adf adffffff";
        System.out.println(lengthOfLast(s));
    }
    static int lengthOfLast(String s){
        int finalCount = 0;
        String [] a = s.split(" ");
        int num = a.length -1;
        String finalString = a[num];



    return finalString.length();
    }
}

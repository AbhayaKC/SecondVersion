package leetcode;

public class Test {
    public static void main(String[] args) {
        String name= "Hello";

        int start =0 ;

        int end = name.length() -1;

        String value ;

        value = String.valueOf(name.charAt(start) + name.charAt(end));

        System.out.println(name.charAt(start));
        System.out.println(value);

    }
}

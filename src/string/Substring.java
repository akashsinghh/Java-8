package string;

import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
//        String s="sachin tendulkar";
//        System.out.println("original"+s);
//        System.out.println("Substring starting from index 6:"+s.substring(6));
//        System.out.println(s.substring(0,6));
        //Using String.split() method:
        String text=new String("Hello, My name is Sachin");
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}

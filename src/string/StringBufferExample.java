package string;

import java.util.StringTokenizer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Hello");
        obj.append("JAVA");
        System.out.println(obj);
        //StringBuffer insert() Method
        StringBuffer obj1=new StringBuffer("Hello");
        obj1.insert(3,"Springboot");
        System.out.println(obj1);
        obj1.delete(1,3);
        System.out.println(obj1);
        // StringBuffer reverse() Method
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb.reverse());

        //spring tokenizeer
        StringTokenizer t=new StringTokenizer("Akash kumar sale harami");
        while (t.hasMoreTokens()){
            System.out.println(t.nextToken());
        }

    }
}

package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerClass {
    public static void main(String[] args) {
        String s="JAVA";
        String s1="";

        for (int i=s.length()-1;i>=0;i--){

            s1=s1+s.charAt(i);
            System.out.println(s1);
        }
//        List<String> cities=new ArrayList<>();
//        cities.add("Delhi");
//        cities.add("Mumbai");
//
//        cities.add("Goa");
//        cities.add("Pune");
////        Consumer<String> printconsumer=city->System.out.println(city);
////        cities.forEach(printconsumer);
//        Predicate<String> filterCity = city -> city.equals("rahul");
//        cities.stream().filter(filterCity).forEach(System.out::println);
    }
}

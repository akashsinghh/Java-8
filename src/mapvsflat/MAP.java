package mapvsflat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MAP {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Akash");
        names.add("shubi");
        names.add("rahul");
        names.add("nishtha");
        names.add("komal");
        System.out.println(names);
       List list= names.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(list);




    }
}

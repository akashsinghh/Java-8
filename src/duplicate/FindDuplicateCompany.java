package duplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateCompany {
    public static void main(String[] args) {
        List<String> companies=new ArrayList<>();
        companies.add("TCS");
        companies.add("Wipro");
        companies.add("Accenture");
        companies.add("capgemini");
        companies.add("cognizant");
        companies.add("Accenture");
        companies.add("capgemini");
        List<String> collect = companies.stream().filter(c -> Collections.frequency(companies, c) > 1).collect(Collectors.toList());
        System.out.println(collect);


    }

}

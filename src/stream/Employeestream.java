package stream;

import model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employeestream {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Akash","IT",24,10000));
        employees.add(new Employee("Rabul","Civil",28,20000));
        employees.add(new Employee("Saurabh","Electronics",32,30000));
        employees.add(new Employee("Gaurav","AAO",31,40000));

        //greater salary 750000
        List<Employee> collect = employees.stream().filter(e -> e.getSalary() > 75000).collect(Collectors.toList());
        System.out.println(collect);

        //sorted ascending oder
        List<Employee> collect1 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(collect1);

        //sorted age order
        List<Employee> collect2 = employees.stream().sorted(Comparator.comparingLong(Employee::getAge)).collect(Collectors.toList());
        System.out.println("sorted age order"+" "+collect2);

        //MAx salary
        Optional<Employee> collect3 = employees.stream().collect(Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)));
        System.out.println("MAx salary::"+" "+collect3);
        //max age
        Optional<Employee> collect4=employees.stream().collect(Collectors.maxBy(Comparator.comparingLong(Employee::getAge)));
        System.out.println("max age::"+" "+collect4);

        //min salary
        Optional<Employee> collect5=employees.stream().collect(Collectors.minBy(Comparator.comparingLong(Employee::getSalary)));
        System.out.println("min salary::"+" "+collect5);
        //min age
        Optional<Employee> collect6=employees.stream().collect(Collectors.minBy(Comparator.comparingLong(Employee::getAge)));
        System.out.println("min age::"+" "+collect6);

        //second largest salary
         Optional<Employee> collect8=  employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(collect8);

        //third largest salary

        Optional<Employee> em1=employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println("Third largest salary::"+em1);

        //fourth largest salry
        Optional<Employee> em2=employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(3).findFirst();
        System.out.println("fourth largest salry"+em2);


    }
}

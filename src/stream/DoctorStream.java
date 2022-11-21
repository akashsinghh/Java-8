package stream;

import model.Doctor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DoctorStream {
    public static void main(String[] args) {
        List<Doctor> doctors=new ArrayList<>();
        doctors.add(new Doctor("Akash","MBBS",24,20000));
        doctors.add(new Doctor("Saurabh","thekadar",28,30000));
        doctors.add(new Doctor("shubhi","MBB",26,40000));
        doctors.add(new Doctor("Saurabh","BS",31,50000));

        List<Doctor> collect = doctors.stream().filter(i -> i.getSalary() > 17000).collect(Collectors.toList());
        System.out.println(collect);

        List<Doctor> collect1 = doctors.stream().sorted(Comparator.comparingLong(Doctor::getSalary)).collect(Collectors.toList());
        System.out.println("Sorted in the behaviour for the age"+collect1);

        List<Doctor> collect2 = doctors.stream().sorted(Comparator.comparingLong(Doctor::getAge)).collect(Collectors.toList());
        System.out.println("Sorted in the behaviour for the age"+collect2);

        Optional<Doctor> collect3 = doctors.stream().collect(Collectors.minBy(Comparator.comparingLong(Doctor::getSalary)));
        System.out.println("Minimum  salary "+"   "+collect3);

        Optional<Doctor> collect4 = doctors.stream().collect(Collectors.maxBy(Comparator.comparingLong(Doctor::getSalary)));
        System.out.println("Maximum  salary "+"   "+collect4);


        ///largest salary
        //second largest salary
        Optional<Doctor> d1=doctors.stream().sorted(Comparator.comparingDouble(Doctor::getSalary).reversed()).skip(1).findFirst();
        System.out.println("second largest salary"+d1);
        //third largest salary
        Optional<Doctor> d2=doctors.stream().sorted(Comparator.comparingDouble(Doctor::getSalary).reversed()).skip(2).findFirst();
        System.out.println(d2);

        Optional<Doctor> d3=doctors.stream().collect(Collectors.maxBy(Comparator.comparingLong(Doctor::getSalary)));
        System.out.println("max"+d3);
    }
}

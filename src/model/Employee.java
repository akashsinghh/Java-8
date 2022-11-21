package model;

public class Employee {
    String name;
    String depy;
    int age;
    int salary;

    public Employee(String name, String depy, int age, int salary) {
        this.name = name;
        this.depy = depy;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepy() {
        return depy;
    }

    public void setDepy(String depy) {
        this.depy = depy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", depy='" + depy + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

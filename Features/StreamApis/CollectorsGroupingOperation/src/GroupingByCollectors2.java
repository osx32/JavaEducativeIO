import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByCollectors2 {
    public static void main(String[] args) {
        List<Employee17> employeeList = new ArrayList<>();
        employeeList.add(new Employee17("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee17("Ben", 63, 25000, "China"));
        employeeList.add(new Employee17("Dave", 34, 56000, "India"));
        employeeList.add(new Employee17("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee17("Ryan", 53, 54000, "China"));

        // The employees are grouped by country and age by using the groupingBy() method twice.
        Map<String, Map<Integer,List<Employee17>>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee17::getCountry, Collectors.groupingBy(Employee17::getAge)));

        System.out.println(employeeMap);
    }
}

class Employee17 {
    String name;
    int age;
    int salary;
    String country;

    Employee17(String name, int age, int salary, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}








//import java.util.*;
//import java.util.stream.Collectors;
//
//public class GroupingByCollectors2 {
//    public static void main(String[] args){
//        List<Employee17> employeeList = new ArrayList<>();
//        employeeList.add(new Employee17("Alex", 23, 23000, "USA"));
//        employeeList.add(new Employee17("Ben", 63, 25000, "China"));
//        employeeList.add(new Employee17("Dave", 34, 56000, "India"));
//        employeeList.add(new Employee17("Jodi", 43, 67000, "USA"));
//        employeeList.add(new Employee17("Ryan", 53, 54000, "China"));
//
//        Map<String, Set<Employee17>> employeeMap = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee17::getCountry, Collectors.toSet()));
//
//        System.out.println(employeeMap);
//    }
//
//}
//
//class Employee17 {
//    String name;
//    int age;
//    int salary;
//    String country;
//
//    Employee17(String name, int age, int salary, String country) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.country = country;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }
//}
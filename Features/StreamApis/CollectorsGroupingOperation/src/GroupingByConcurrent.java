import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class GroupingByConcurrent {

    public static void main(String args[]) {
        List<Employee1> employeeList = new ArrayList<>();
        employeeList.add(new Employee1("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee1("Ben", 63, 25000, "China"));
        employeeList.add(new Employee1("Dave", 34, 56000, "India"));
        employeeList.add(new Employee1("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee1("Ryan", 53, 54000, "China"));

        ConcurrentMap<String,List<Employee1>> employeeMap = employeeList.parallelStream()
                .collect(Collectors.groupingByConcurrent(Employee1::getCountry));

        System.out.println(employeeMap);
    }
}

class Employee1 {
    String name;
    int age;
    int salary;
    String country;

    Employee1(String name, int age, int salary, String country) {
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

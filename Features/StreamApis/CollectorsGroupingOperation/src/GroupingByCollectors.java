import java.util.*;
import java.util.stream.Collectors;

public class GroupingByCollectors {
    public static void main(String args[]) {
        List<Employee16> employeeList = new ArrayList<>();
        employeeList.add(new Employee16("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee16("Ben", 63, 25000, "China"));
        employeeList.add(new Employee16("Dave", 34, 56000, "India"));
        employeeList.add(new Employee16("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee16("Ryan", 53, 54000, "China"));

        // The employees are grouped by country using the groupingBy() method.
        Map<String,List<Employee16>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee16::getCountry));

        System.out.println(employeeMap);
    }
}

class Employee16 {
    String name;
    int age;
    int salary;
    String country;

    Employee16(String name, int age, int salary, String country) {
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
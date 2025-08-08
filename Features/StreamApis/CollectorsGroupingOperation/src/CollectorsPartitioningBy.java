import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class CollectorsPartitioningBy {

    public static void main(String args[]) {
        List<Employee3> employeeList = new ArrayList<>();
        employeeList.add(new Employee3("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee3("Ben", 63, 25000, "China"));
        employeeList.add(new Employee3("Dave", 34, 56000, "India"));
        employeeList.add(new Employee3("Jodi", 43, 67000, "USA"));
        employeeList.add(new Employee3("Ryan", 53, 54000, "China"));

        // Partitioning the list based on age.
        Map<Boolean, List<Employee3>> employeeMap = employeeList.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));

        System.out.println(employeeMap);
    }
}

class Employee3 {
    String name;
    int age;
    int salary;
    String country;

    Employee3(String name, int age, int salary, String country) {
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

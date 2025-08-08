import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AveragingIntAggregation {
    public static void main(String[] args) {
        List<Employee17> employeeList = new ArrayList<>();
        employeeList.add(new Employee17("Alex", 23, 23000));
        employeeList.add(new Employee17("Ben", 63, 25000));
        employeeList.add(new Employee17("Dave", 34, 56000));
        employeeList.add(new Employee17("Jodi", 43, 67000));
        employeeList.add(new Employee17("Ryan", 53, 54000));

        // Using averagingInt() method to get the average of salaries of all employees
        double average = employeeList.stream()
                .collect(Collectors.averagingInt(emp -> emp.getSalary()));

        System.out.println(average);
    }
}

class Employee17 {
    String name;
    int age;
    int salary;

    Employee17(String name) {
        this.name = name;
    }

    Employee17(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

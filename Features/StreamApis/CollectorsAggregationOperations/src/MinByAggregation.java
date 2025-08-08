import java.util.*;
import java.util.stream.Collectors;

public class MinByAggregation {
    public static void main(String[] args) {
        List<Employee18> employeeList = new ArrayList<>();
        employeeList.add(new Employee18("Alex", 23, 23000));
        employeeList.add(new Employee18("Ben", 63, 25000));
        employeeList.add(new Employee18("Dave", 34, 56000));
        employeeList.add(new Employee18("Jodi", 43, 67000));
        employeeList.add(new Employee18("Ryan", 53, 54000));

        // Usiing minBy() method to get the employee with min salary
        Optional<Employee18> employee = employeeList.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee18::getSalary)));

        System.out.println(employee.get().getName());
    }
}


class Employee18 {
    String name;
    int age;
    int salary;

    Employee18(String name) {
        this.name = name;
    }

    Employee18(String name, int age, int salary) {
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

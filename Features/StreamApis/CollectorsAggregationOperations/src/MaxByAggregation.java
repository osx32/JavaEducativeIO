import java.util.*;
import java.util.stream.Collectors;

public class MaxByAggregation {
    public static void main(String[] args) {
        List<Employee19> employeeList = new ArrayList<>();
        employeeList.add(new Employee19("Alex", 23, 23000));
        employeeList.add(new Employee19("Ben", 63, 25000));
        employeeList.add(new Employee19("Dave", 34, 56000));
        employeeList.add(new Employee19("Jodi", 43, 67000));
        employeeList.add(new Employee19("Ryan", 53, 54000));

        //Using maxBy() method to get the employee with max salary
        Optional<Employee19> employee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee19::getSalary)));

        System.out.println(employee.get().getName());
    }

}


class Employee19 {
    String name;
    int age;
    int salary;

    Employee19(String name) {
        this.name = name;
    }

    Employee19(String name, int age, int salary) {
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
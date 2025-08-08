import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntAggregation {
    public static void main(String[] args) {
        List<Employee16> employeeList = new ArrayList<>();
        employeeList.add(new Employee16("Alex", 23, 23000));
        employeeList.add(new Employee16("Ben", 63, 25000));
        employeeList.add(new Employee16("Dave", 34, 56000));
        employeeList.add(new Employee16("Jodi", 43, 67000));
        employeeList.add(new Employee16("Ryan", 53, 54000));

        // Using summingInt() method to get the sum of salaries of all employees
        int count = employeeList.stream()
                .collect(Collectors.summingInt(emp -> emp.getSalary()));

        System.out.println(count);
    }
}

class Employee16{
    String name;
    int age;
    int salary;

    Employee16(String name){
        this.name = name;
    }

    public Employee16(String name, int age, int salary) {
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
import java.util.*;

public class FlatMapOptional {
    public static void main(String[] args){
        // Creating an Optional of Employee object.
        Optional<Employee10> optional = Optional.of(new Employee10("Adam", 54, 20000));
        optional.flatMap(emp -> emp.getSalary())
                .filter(sal -> sal > 10000)
                .ifPresent(System.out::println);
    }
}

class Employee10{
    String name;
    int age;
    int salary;

    Employee10(String name) {
        this.name = name;
    }

    Employee10(String name, int age, int salary) {
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

    public Optional<Integer> getSalary() {
        return Optional.of(salary);
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
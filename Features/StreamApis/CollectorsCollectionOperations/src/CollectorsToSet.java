import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToSet {
    public static void main(String[] args) {
        List<Employee13> employeeList = new ArrayList<>();
        employeeList.add(new Employee13("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee13("Ben" , 63, 25000, "India"));
        employeeList.add(new Employee13("Dave" , 34, 56000, "Bhutan"));
        employeeList.add(new Employee13("Jodi" , 43, 67000, "China"));
        employeeList.add(new Employee13("Ryan" , 53, 54000, "Libya"));

        Set<String> empName = employeeList.stream()
                .map(emp -> emp.getCountry())
                .collect(Collectors.toSet());

        System.out.println(empName);

    }

}

class Employee13 {
    String name;
    int age;
    int salary;
    String country;

    Employee13(String name, int age, int salary, String country) {
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

    public Integer getSalary() {
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

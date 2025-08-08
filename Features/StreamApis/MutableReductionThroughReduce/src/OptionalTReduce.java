import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OptionalTReduce {
    public static void main(String[] args) {
        List<Employee11> list = new ArrayList<>();
        list.add(new Employee11("Dave", 23, 20000));
        list.add(new Employee11("Joe", 18,40000));
        list.add(new Employee11("Ryan", 54,100000));
        list.add(new Employee11("Iyan", 5,34000));
        list.add(new Employee11("Ray", 63,54000));

        Optional<Integer> totalSalary = list.stream()
                .map(p -> p.getSalary()) // We are converting the Stream of Employees to Stream of salaries
                .reduce((p,q) -> p + q);

        if(totalSalary.isPresent()){
            System.out.println("The total salary is " + totalSalary.get());
        }
    }
}

class Employee11 {
    String name;
    int age;
    int salary;

    Employee11(String name, int age, int salary) {
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
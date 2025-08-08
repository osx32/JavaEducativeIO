import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToCollection {
    public static void main(String[] args) {
        List<Employee14> employeeList = new ArrayList<>();
        employeeList.add(new Employee14("Alex", 23, 23000));
        employeeList.add(new Employee14("Ben", 63, 25000));
        employeeList.add(new Employee14("Dave", 34, 56000));
        employeeList.add(new Employee14("Jodi", 43, 67000));
        employeeList.add(new Employee14("Ryan", 53, 54000));

        LinkedList<String> empName = employeeList.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(empName);
    }
}



class Employee14{
    String name;
    int age;
    int salary;

    Employee14(String name){
        this.name = name;
    }

    Employee14(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
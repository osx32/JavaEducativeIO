import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class IfPresentOptional {
    Map<Integer, Employee8> empMap = new HashMap<>();
    public void populateEmployee(){
        empMap.put(123,new Employee8("Alex", 23, 12000));
    }

    public Optional<Employee8> getEmployee(Integer employeeId){
        //Before returning the employee object we are wrapping it into an Optional
        return Optional.ofNullable(empMap.get(employeeId));
    }

    public static void main(String[] args){
        IfPresentOptional demo = new IfPresentOptional();
        demo.populateEmployee();
        Optional<Employee8> emp = demo.getEmployee(123);
        emp.ifPresent(System.out::println);
    }

}


class Employee8{
    String name;
    int age;
    int salary;

    Employee8(String name){
        this.name = name;
    }

    Employee8(String name, int age, int salary){
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

    public int getSalary(){
        return salary;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;


public class OptionalExample2{
    Map<Integer, Employee7> empMap = new HashMap<>();
    public Optional<Employee7> getEmployee(Integer employeeId){
        //Before returning the employee object we are wrapping it into an Optional
        return Optional.ofNullable(empMap.get(employeeId));
    }

    public static void main(String[] args) {
        OptionalExample2 demo = new  OptionalExample2();
        Optional<Employee7> emp = demo.getEmployee(123);
        //Before getting a value from Optional we check if the value is present through isPresent() method
        if(emp.isPresent()){
            System.out.println(emp.get().getName()); // We use get() method to get the value from Optional
        }
        else{
            System.out.println("No employee returned");
        }
    }

}

class Employee7{
    String name;
    int age;
    int salary;

    Employee7(String name){
        this.name = name;
    }

    Employee7(String name, int age, int salary){
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
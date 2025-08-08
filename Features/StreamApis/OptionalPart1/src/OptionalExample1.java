import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;


public class OptionalExample1 {
    Map<Integer, Employee5> empMap = new HashMap<>();

    public Employee5 getEmployee(Integer employeeId){
        return empMap.get(employeeId);
    }

    public static void main(String[] args) {
        OptionalExample1 demo = new OptionalExample1();

        //Fetching the employee with id 123. But since map is empty this will be null
        Employee5 emp = demo.getEmployee(123);

        //This will throw Null Pointer Exception because emp is null
        System.out.println(emp.getName());
    }
}


class Employee5{
    String name;
    int age;
    int salary;

    Employee5(String name){
        this.name = name;
    }

    Employee5(String name, int age, int salary){
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
        return "Employee{"+
                "name='"+name+'\''+
                ", age="+age+
                ", salary="+salary+
                '}';

    }
}
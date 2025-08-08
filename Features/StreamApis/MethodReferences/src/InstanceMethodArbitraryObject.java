import java.util.ArrayList;
import java.util.List;


public class InstanceMethodArbitraryObject {
    public int getLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        List<Employee4> list = new ArrayList<>();
        list.add(new Employee4("Dave", 23, 20000));
        list.add(new Employee4("Joe", 18, 40000));
        list.add(new Employee4("Ryan", 54, 100000));
        list.add(new Employee4("Iyan", 5, 34000));
        list.add(new Employee4("Ray", 63, 54000));

        //Code without using method reference
        int totalSalary1 = list.stream()
                .mapToInt(emp -> emp.getSalary())
                .sum();

        //Code with method reference
        int totalSalary = list.stream()
                .mapToInt(Employee4::getSalary)
                .sum();

        System.out.println("The total salary is " + totalSalary);
    }
}


class Employee{
    String name;
    int age;
    int salary;


    Employee(String name, int age, int salary){
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
                "naem="+name+'\''+
                ", age="+age+
                ", salary="+salary+
                '}';
    }
}
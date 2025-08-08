import java.util.ArrayList;
import java.util.List;

public class ConstructorReferences {
    public int getLength(String str){
        return str.length();
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");

        //Code without constructor reference
        list.stream()
                .map(name -> new Employee4(name))
                .forEach(System.out::println);

        //Code with constructor reference
        list.stream()
                .map(Employee4::new)
                .forEach(System.out::println);
    }

}

class Employee4 {
    String name;
    int age;
    int salary;

    Employee4(String name){
        this.name = name;
    }

    Employee4(String name, int age, int salary){
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
                "name="+name+'\''+
                ", age="+age+
                ", salary="+salary+
                '}';
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1{
    String name;
    int age;

    public Employee1(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }
}

public class AscOrder {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1("Jane", 29));
        list.add(new Employee1("Alex", 24));

        //Collections.sort(list);
        System.out.println("ArrayList in asc order: " + list);
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Employee3> list = new ArrayList<>();
        list.add(new Employee3("Alex", 23, "USA"));
        list.add(new Employee3("Dave", 34, "India"));
        list.add(new Employee3("Carl", 21, "USA"));
        list.add(new Employee3("Joe", 56, "Russia"));
        list.add(new Employee3("Amit", 64, "China"));
        list.add(new Employee3("Ryan", 19, "Brazil"));

        System.out.println("Sorting all the employees by country name");
        Collections.sort(list, (e1, e2) -> e1.country.compareTo(e2.country));
        for(Employee3 emp: list){
            System.out.println("Employee Name: " + emp.name + ", Employee Country: "+ emp.country);
        }
    }
}

class Employee3{
    String name;
    int age;
    String country;

    public Employee3(String name, int age, String country){
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }
}


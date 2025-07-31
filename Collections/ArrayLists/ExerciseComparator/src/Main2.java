import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void  main(String[] args){
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2("Alex", 23, "USA"));
        list.add(new Employee2("Dave", 34, "India"));
        list.add(new Employee2("Carl", 21, "USA"));
        list.add(new Employee2("Joe", 56, "Russia"));
        list.add(new Employee2("Amit", 64, "China"));
        list.add(new Employee2("Ryan", 19, "Brazil"));

        System.out.println("Removing the employees residing in USA from the list");
        Iterator<Employee2> itr = list.iterator();
        while(itr.hasNext()) {
            if(itr.next().country.equals("USA")) {
                itr.remove();
            }
        }

        for(Employee2 emp: list){
            System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
        }
    }
}


class Employee2{
    String name;
    int age;
    String country;

    public Employee2(String name, int age, String country){
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }
}
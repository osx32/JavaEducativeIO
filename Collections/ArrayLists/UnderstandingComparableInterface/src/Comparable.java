import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Comparable{
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2("Jane", 29));
        list.add(new Employee2("Alex", 54));
        list.add(new Employee2("Matt", 19));
        list.add(new Employee2("Roy", 72));

        Collections.sort(list);
        for(Employee2 emp : list){
            System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age);
        }
    }
}

class Employee2 implements java.lang.Comparable<Employee2>{
    String name;
    int age;

    public Employee2(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee2 emp){
        //We will sort the employee based on age in ascending order
        //returns a negative integer, zero, or a positive integer as this employee age
        //is less than, equal to, or greater than the specified object.
        return (this.age - emp.age);
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(123, "Alex");
        employeeMap.put(342, "Ryan");
        employeeMap.put(143, "Joe");
        employeeMap.put(234, "Allen");
        employeeMap.put(432, "Roy");

        System.out.println("Sorting by key");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey())
                .forEach(System.out::println);

        System.out.println("Sorting by value");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


    }
}
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentifyHashMap {
    public static void main(String[] args) {
        Employee6 emp1 = new Employee6(123,"Saurav");
        Employee6 emp2 = new Employee6(123, "Saurav");

        Map<Employee6, String> hashMap = new HashMap<>();
        hashMap.put(emp1, "emp1");
        hashMap.put(emp2, "emp2");

        Map<Employee6, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(emp1, "emp1");
        identityHashMap.put(emp2, "emp2");

        System.out.println("The employee objects in HashMap are:");
        System.out.println(hashMap);

        System.out.println();
        System.out.println("The employee objects in IdentityHashMap are:");
        System.out.println(identityHashMap);

    }
}
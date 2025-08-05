import java.util.HashMap;
import java.util.Map;

public class HashMapDemoHashMap3 {
    public static void main(String[] args) {
        EmployeeHashMap3 emp1 = new EmployeeHashMap3(123, "Jane");

        Map<EmployeeHashMap3, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);

        emp1.empName = "Alex";

        System.out.println(employeeMap.get(emp1));

    }

}

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemoHashMap2 {

    public static void main(String args[]) {

        EmployeeHashMap2 emp1 = new EmployeeHashMap2(123, "Jane");
        EmployeeHashMap2 emp2 = new EmployeeHashMap2(123, "Jane");

        Map<EmployeeHashMap2, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);
        employeeMap.put(emp2, 45000);

        for(Entry<EmployeeHashMap2, Integer> entry : employeeMap.entrySet()) {
            System.out.println("Employee Id: " + entry.getKey().empId + " Employee Name: " + entry.getKey().empName);
        }

    }
}

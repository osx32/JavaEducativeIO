import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemoHashMap1 {
    public static void main(String[] args) {
        EmployeeHashMap1 emp1 = new EmployeeHashMap1(123, "Jane");
        EmployeeHashMap1 emp2 = new EmployeeHashMap1(123, "Jane");
        Map<EmployeeHashMap1, Integer> employeeMap = new HashMap<>();

        employeeMap.put(emp1, 56000);
        employeeMap.put(emp2, 65000);

        for(Entry<EmployeeHashMap1, Integer> entry: employeeMap.entrySet()){
            System.out.println("Employee Id: " + entry.getKey().empId + " Employee Name: " + entry.getKey().empName);
        }

    }

}

public class EmployeeHashMap3 {

    int empId;
    String empName;

    public EmployeeHashMap3(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empId;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        EmployeeHashMap3 emp = (EmployeeHashMap3) obj;
        return this.empId == emp.empId;
    }

}
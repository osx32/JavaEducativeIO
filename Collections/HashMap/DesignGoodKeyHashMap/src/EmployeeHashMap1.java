public class EmployeeHashMap1 {
        int empId;
        String empName;

        public EmployeeHashMap1(int empId, String empName){
            super();
            this.empId = empId;
            this.empName = empName;
        }

        @Override
        public int hashCode(){
            final int prime = 31;
            int result = 1;
            result = prime * result + empId;
            result = prime * result + ((empName == null) ? 0 : empName.hashCode());
            return result;
        }
}
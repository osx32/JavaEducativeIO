import java.util.Arrays;

public class ObjectArray {
    public static void main(String[] args) {
        //Creating an Array of Employee objects
        ObjectEmployee[] employees = {new ObjectEmployee(123, "Jay"), new ObjectEmployee(124, "Ryan")};

        //Creating the copy of Array
        ObjectEmployee[] copiedArray = Arrays.copyOf(employees, 2);

        //Changing the name of first employee in original array
        employees[0] = new ObjectEmployee(123, "Changed Name");

        //Printing the name of frist employee in original array
        System.out.println(employees[0].empName);

        //Printing the name of first employee in copied array
        System.out.println(copiedArray[0].empName);
    }
}

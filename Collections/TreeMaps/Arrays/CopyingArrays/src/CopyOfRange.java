import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int[] newArray = Arrays.copyOfRange(numbers, 0, 5);

        System.out.println("The copied array is: ");

        for(int i: newArray){
            System.out.println(i);
        }
    }
}

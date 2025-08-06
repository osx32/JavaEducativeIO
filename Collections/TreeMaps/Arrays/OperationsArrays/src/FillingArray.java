import java.util.Arrays;

public class FillingArray {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Arrays.fill(numbers, 20);

        for(int i : numbers){
            System.out.println(i + " ");
        }
    }
}

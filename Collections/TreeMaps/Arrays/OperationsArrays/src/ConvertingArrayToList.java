import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToList {
    public static void main(String[] args) {
        Integer[]numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(numbers);
        System.out.println(list);

    }
}
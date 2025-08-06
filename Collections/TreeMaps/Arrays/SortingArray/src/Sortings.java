import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
        Integer[] numbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.sort(numbers);

        for(int i: numbers){
            System.out.println(i + " ");
        }

    }
}
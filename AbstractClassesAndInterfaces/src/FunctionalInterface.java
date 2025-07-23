import java.util.ArrayList;

public class FunctionalInterface {
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(4);
    numbers.forEach((n) -> {System.out.println(n);});
    }
}

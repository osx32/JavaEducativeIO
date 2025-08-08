import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class LimitSlicingOperations {
    public static void main(String[] args){
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");

        countries.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

    }
}

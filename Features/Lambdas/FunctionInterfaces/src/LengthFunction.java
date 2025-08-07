import java.util.function.Function;

public class LengthFunction {
    public static void main(String[] args) {
        //Created a function which returns the length of string
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("String length: " + lengthFunction.apply("This is awesome"));
    }
}
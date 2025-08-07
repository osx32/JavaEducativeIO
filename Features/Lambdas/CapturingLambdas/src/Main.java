import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplier = getMultiplier();

        System.out.println(multiplier.apply(10));
    }

    public static Function<Integer, Integer> getMultiplier(){
        int i = 5;
        //The below lambda has copied value of i
        Function<Integer, Integer> multiplier = t -> t * i;
        //If you change the value of i here, then the lambda will have old value
        //So this is not allowed and code will not compile
        return multiplier;
    }
}
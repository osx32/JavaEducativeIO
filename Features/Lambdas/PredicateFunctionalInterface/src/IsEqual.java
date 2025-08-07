import java.util.Arrays;
import java.util.function.Predicate;

public class IsEqual {
    public static void main(String[] args){
        Predicate<String> predicate = Predicate.isEqual("Hello");
        //The same thing can be achieved by below lambda
        //Predicate<String> predicate = p -> p.equals("Hello");

        System.out.println("Welcome");
    }

}

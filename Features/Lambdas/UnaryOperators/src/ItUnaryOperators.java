import java.util.function.IntUnaryOperator;

public class ItUnaryOperators {
    public static void main(String[] args) {
        IntUnaryOperator operator= num -> num * num;

        System.out.println(operator.applyAsInt(25));
    }
}

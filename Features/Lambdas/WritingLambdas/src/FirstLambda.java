//@FunctionalInterface
//interface Mathematics{
//    void operation(int a, int b);
//}
//
//
//public class FirstLambda {
//    public static void main(String[] args){
//        Mathematics sum = (a, b) -> System.out.println("Sum: " + (a + b));
//        sum.operation(10, 6);
//
//        Mathematics minus = (int a, int b) -> System.out.println("Minus: " + (a - b));
//        minus.operation(10, 6);
//
//        Mathematics multiply = (int a, int b) -> System.out.println("Multiply: " + (a * b));
//        multiply.operation(10, 6);
//    }
//
//}


import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstLambda {
    public static void main(String[] args) {
        //Stream<T> filter(Predicate<? super T> predicate;

        Integer[] list = new Integer[]{57,11,10,17,25};
        Arrays.stream(list).filter(x -> x > 10).forEach(System.out::println);

        System.out.println("--------------");

        Predicate<Integer> greaterThan10 = x -> x < 10;
        Stream<Integer> integerList = Arrays.stream(list).filter(greaterThan10);
        integerList.forEach(System.out::println);

        System.out.println("--------");

        String[] nameList = new String[]{"Ahmet", "Mehmet", "Cemal", "Yusuf", "Metin", "Dilek"};
        Arrays.stream(nameList).filter(x -> x.startsWith("M")).forEach(System.out::println);
    }
}

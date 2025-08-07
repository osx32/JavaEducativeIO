import java.util.function.Predicate;
import java.util.function.Supplier;

public class Suppliers {
    static boolean isPersonEligibleForVoting(
            Supplier<Person4> supplier, Predicate<Person4> predicate){
        return predicate.test(supplier.get());
    }

    public static void main(String[] args) {
        Supplier<Person4> supplier = () -> new Person4("Alex", 23);
        Predicate<Person4> predicate = (p) -> p.age > 18;
        boolean eligible = isPersonEligibleForVoting(supplier, predicate);
        System.out.println("Person is eligible for voting: " + eligible);

    }
}

class Person4{
    String name;
    int age;

    Person4(String name, int age){
        this.name = name;
        this.age = age;
    }
}
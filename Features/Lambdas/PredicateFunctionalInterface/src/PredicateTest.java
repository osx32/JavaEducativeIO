import java.util.function.BiPredicate;

public class PredicateTest {
    static boolean isPersonEligibleForVoting(
            Person3 person, Integer minAge, BiPredicate<Person3, Integer> predicate){
        return predicate.test(person, minAge);
    }

    public static void main(String args[]){
        Person3 person = new Person3("Alex", 23);
        boolean eligible = isPersonEligibleForVoting(person, 18, (p, minAge) -> { return p.age > minAge;});
        System.out.println("Person is eligible fro voting: " + eligible);
    }
}

class Person3 {
    String name;
    int age;

    Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

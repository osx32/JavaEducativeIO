import java.util.function.Predicate;

public class AndPredicateOther {
    static boolean isPersonEligibleForMember(Person1 person, Predicate<Person1> predicate){
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person1 person = new Person1("Alex", 23);

        //Created a predicative It returns true if age is greater than 18
        Predicate<Person1> greaterThanEighteen  = (p) -> p.age > 18;
        //Created a predicate. IT returns true if age is less tan 60
        Predicate<Person1> lessThanSixty = (p) -> p.age < 60;

        Predicate<Person1> predicate = greaterThanEighteen.and(lessThanSixty);

        boolean eligible = isPersonEligibleForMember(person, predicate);
        System.out.println("Person is eligible for membership");
    }

}

class Person1{
    String name;
    int age;
    Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

}
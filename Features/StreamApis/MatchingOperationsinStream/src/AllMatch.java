import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatch {
    public static void main(String[] args) {
        List<Person2> list = new ArrayList<>();
        list.add(new Person2("Dave", 23, "India"));
        list.add(new Person2("Joe", 18,"USA"));
        list.add(new Person2("Ryan", 54,"Canada"));
        list.add(new Person2("Iyan", 5,"India"));
        list.add(new Person2("Ray", 63,"China"));

        boolean anyCanadian = list.stream()
                .allMatch(p -> p.getCountry().equals("Canada"));

        System.out.println("Are all persons canadian: " + anyCanadian);
    }

}

class Person2 {
    String name;
    int age;
    String country;

    Person2(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

}

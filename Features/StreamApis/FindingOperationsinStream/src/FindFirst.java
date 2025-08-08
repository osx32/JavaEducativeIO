import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Person4> list = new ArrayList<>();
        list.add(new Person4("Dave", 23,"India"));
        list.add(new Person4("Joe", 18,"USA"));
        list.add(new Person4("Ryan", 54,"Canada"));
        list.add(new Person4("Iyan", 5,"India"));
        list.add(new Person4("Ray", 63,"China"));

        Optional<Person4> person = list.stream()                        // Creating a Stream of person objects
                .filter(p -> p.getCountry().equals("India"))    // Filter to get only persons living in India
                .findFirst();                                           // Returning the first person encountered

        if(person.isPresent()){
            System.out.println(person);
        }
    }
}

class Person4 {
    String name;
    int age;
    String country;

    Person4(String name, int age, String country) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }

}
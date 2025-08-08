import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Person5> list = new ArrayList<>();
        list.add(new Person5("Dave", 23,"India"));
        list.add(new Person5("Joe", 18,"USA"));
        list.add(new Person5("Ryan", 54,"Canada"));
        list.add(new Person5("Iyan", 5,"India"));
        list.add(new Person5("Ray", 63,"China"));

        Optional<Person5> person = list.stream()
                .filter(p -> p.getCountry().equals("India"))
                .findAny();

        if(person.isPresent()){
            System.out.println(person);
        }
    }

}


class Person5 {
    String name;
    int age;
    String country;

    Person5(String name, int age, String country) {
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


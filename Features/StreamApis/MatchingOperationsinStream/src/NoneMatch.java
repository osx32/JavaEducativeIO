import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NoneMatch {
    public static void main(String[] args){
        List<Person3> list = new ArrayList<>();
        list.add(new Person3("Dave", 23, "India"));
        list.add(new Person3("Joe", 18,"USA"));
        list.add(new Person3("Ryan", 54,"Canada"));
        list.add(new Person3("Iyan", 5,"India"));
        list.add(new Person3("Ray", 63,"China"));

        boolean anyRussian = list.stream()
                .noneMatch(p -> p.getCountry().equals("Russia"));

        System.out.println(anyRussian);
    }

}

class Person3 {
    String name;
    int age;
    String country;

    Person3(String name, int age, String country) {
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
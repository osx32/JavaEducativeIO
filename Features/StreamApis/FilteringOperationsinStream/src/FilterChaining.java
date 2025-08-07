import java.util.ArrayList;
import java.util.List;

public class FilterChaining {
    public static void main(String[] args) {
        List<Person7> list = new ArrayList<>();
        list.add(new Person7("Dave",23));
        list.add(new Person7("Joe", 18));
        list.add(new Person7("Ryan", 54));
        list.add(new Person7("Iyan", 5));
        list.add(new Person7("Ray", 63));

        list.stream()
                .filter(person -> person.getName() != null) //Filtering the object where name is not null
                .filter(person -> person.getAge() > 18) //Filtering the objects where age is greater than 18
                .filter(person -> person.getAge() < 60) //Filtering the objects where age is less than 60
                .forEach(System.out::println);
    }
}

class Person7{
    String name;
    int age;

    Person7(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Person{" +
                "name=" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

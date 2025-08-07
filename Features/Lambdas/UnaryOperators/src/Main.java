import java.util.function.UnaryOperator;

public class Main {
    public static void main(String args[]) {
        Person4 person = new Person4();
        UnaryOperator<Person4> operator = (p) -> {
            p.name = "John";
            p.age = 34;
            return p;
        };

        operator.apply(person);
        System.out.println("Person Name: " + person.getName() + " Person Age: " + person.getAge());
    }
}


class Person4 {
    String name;
    int age;

    Person4(){

    }

    Person4(String  name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
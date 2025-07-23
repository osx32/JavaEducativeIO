//interface Flyable{
//    void fly();
//}
//
//interface Swimmable{
//    void swim();
//}
//
//class Duck implements Flyable, Swimmable{
//    public void fly(){
//        System.out.println("Duck flies");
//    }
//
//    public void swim(){
//        System.out.println("Duck swims");
//    }
//}
//
//
//public class MultipleInheritance {
//    public static void main(String[] args) {
//        Duck duck = new Duck();
//        duck.fly();
//        duck.swim();
//    }
//}


interface A{
    default void greet(){
        System.out.println("Hello World from A");
    }
}

interface B{
    default void greet(){
        System.out.println("Hello World from B");
    }
}

class C implements A,B{
    public void greet(){
        System.out.println("Hello World from C");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        C c = new C();
        c.greet();
    }
}
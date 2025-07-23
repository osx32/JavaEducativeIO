//class Animal{
//    public void animalSound(){
//        System.out.println("Animal make a sound");
//    }
//}
//
//class Dog extends Animal{
//    public void animalSound(){
//        super.animalSound();
//        System.out.println("Dog make a sound");
//    }
//}
//public class SuperKeyword {
//    public static void main(String[] args) {
//        Dog rex = new Dog();
//        rex.animalSound();
//    }
//}


class Animal{
    String type = "Animal";
}

class Dog extends Animal{
    String type = "Dog";

    public void printType(){
        System.out.println(super.type); //Access parent attribute
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.printType();
    }
}
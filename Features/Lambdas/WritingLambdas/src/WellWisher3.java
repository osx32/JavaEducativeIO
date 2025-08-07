public class WellWisher3 {
    public static void wish(Greetings3 greeting){
        greeting.greet();
    }

    //Passing a lambda expression to wish method
    public static void main(String[] args){
        wish(() -> System.out.println("Namaste"));
    }

}

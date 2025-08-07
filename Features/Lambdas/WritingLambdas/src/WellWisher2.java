public class WellWisher2 {
    public static void wish(Greeting2 greeting){
        greeting.greet();
    }

    public static void main(String[] args) {
        //We are passing an anonymous class object to the wşsh methodd
        wish(new Greeting2(){
            @Override
            public void greet(){
                System.out.println("Namaste");
            }
        });
    }

}

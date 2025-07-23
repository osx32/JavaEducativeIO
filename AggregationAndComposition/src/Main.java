public class Main {
    public static void main(String[] args) {
        Engine engineV8 = new Engine();
        Car McLaren = new Car(engineV8);
        McLaren.startCar();

        Human person = new Human();
        person.think();
    }
}
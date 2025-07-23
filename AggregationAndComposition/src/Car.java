public class Car {
    Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }

    void startCar(){
        engine.start();
        System.out.println("Car is running");
    }
}

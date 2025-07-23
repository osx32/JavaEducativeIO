import javax.swing.plaf.basic.BasicBorders;

class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand=brand;
    }

    void start(){
        System.out.println(brand + " is starting....");
    }

    void stop(){
        System.out.println(brand + " is stopping....");
    }
}

class Car extends Vehicle{
    String model;

    Car(String brand, String model){
        super(brand); //Call vehicle constructor
        this.model = model;
    }

    void drive(){
        System.out.println(brand + " is driving....");
    }
}

class ElectricCar extends Car{
    int batteryLevel;

    ElectricCar(String brand, String model, int batteryLevel){
        super(brand, model);
        this.batteryLevel = batteryLevel;
    }

    @Override
    void start(){
        System.out.println(brand + " " + model + " is starting silently (electric mode).");
    }

    void charge(){
        System.out.println(brand + " " + model + " is charging. Battery: " + batteryLevel + "%");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        ElectricCar Togg = new ElectricCar("Togg", "X10", 80);

        Togg.start();
        Togg.drive();
        Togg.charge();
        Togg.stop();

        Vehicle myVehicle = new ElectricCar("Tesla", "Model S", 80);
        myVehicle.start();




    }

}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "i8");
        test(car);
    }

    public static void test(Vehicle vehicle) {
        System.out.println(vehicle);
    }


}
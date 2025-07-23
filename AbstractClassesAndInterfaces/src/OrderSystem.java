import java.util.function.Function;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

interface OrderProcessor{
    void process(String itemName, int quantity);
}

//public class OrderSystem{
//    public static void main(String[] args){
//        //Implement Interface Method with Lambda
//        OrderProcessor processor = (itemName, quantity) -> {
//            System.out.println("Sipariş alındı: " + quantity + " adet " + itemName);
//            System.out.println("Sipariş hazırlanıyor....");
//            System.out.println("Sipariş tamamlandı!");
//        };
//
//        //Sipariş ver
//        takeOrder("Laptop", 2, processor);
//        takeOrder("Klavye", 5, processor);
//
//
//    }
//
//    public static void takeOrder(String itemName, int quantity, OrderProcessor processor){
//        //Siparişi izle
//        processor.process(itemName, quantity);
//        System.out.println("----------------------");
//    }
//}

//  1.EXTENDED ORDER CLASS
class Order {
    String itemName;
    int quantity;
    double unitPrice;

    public Order(String itemName, int quantity, double unitPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return quantity + " x " + itemName + " (" + unitPrice + " TL) = " + getTotalPrice() + " TL";
    }

}

// MAIN CLASS ORDER MANAGEMENT
class OrderSystem{
    public static void main(String[] args){
        List<Order> orders =  new ArrayList<>();

        //Orders adedd
        orders.add(new Order("Laptop", 2, 15000));
        orders.add(new Order("Klavye", 5, 300));
        orders.add(new Order("Fare", 10, 150));
        orders.add(new Order("Monitor", 1, 2500));
        orders.add(new Order("USB", 0, 100)); // Invalid oorder

        //1. Prediate -> Fillter all valid order
        Predicate<Order> isValidOrder = o -> o.quantity > 0;
        List<Order> validOrders = orders.stream()
                                            .filter(isValidOrder)
                                            .collect(Collectors.toList());

        //2.Function -> Filter current order
        Function<Order, Double> calculateTotal = Order::getTotalPrice;

        //3. Consumer -> Print order
        Consumer<Order> printOrder = o -> {
            System.out.println(o.toString());
        };

        //4.Process
        System.out.println("Valid Orders: ");
        validOrders.forEach(printOrder);

        //5.All orders price
        double grandTotal = validOrders.stream()
                                        .map(calculateTotal)
                                        .reduce(0.0, Double::sum);

        System.out.println("\n All Orders Price: " + grandTotal + " TL");
    }
}
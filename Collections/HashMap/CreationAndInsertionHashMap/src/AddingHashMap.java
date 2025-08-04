import java.util.HashMap;
import java.util.Map;

public class AddingHashMap {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56); // Inserting share price of Oracle in the Map
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 60); // Inserting share price ofOracle again. This will update the value
        System.out.println(stockPrice);

        stockPrice.putIfAbsent("Oracle", 70); // Inserting share price of Oracle again using putIfAbsent() method. This will not update the value
        System.out.println(stockPrice);

    }
}
import java.util.HashMap;
import java.util.Map;

public class ContainsHashMap {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 100);
        stockPrice.put("Fiserv", 200);
        stockPrice.put("BMW", 300);

        System.out.println(stockPrice.containsKey("Oracle"));
        System.out.println(stockPrice.containsValue(73));
    }
}

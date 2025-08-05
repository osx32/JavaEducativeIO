import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForLoopHashMap {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 100);
        stockPrice.put("Fiserv", 200);
        stockPrice.put("BMW", 300);
        stockPrice.put("Microsoft", 400);

        Set<Entry<String, Integer>> entrySet = stockPrice.entrySet(); // Returns a Set of Entries

        for(Entry<String, Integer> entry : entrySet) {
            System.out.println("Company Name: " + entry.getKey() + " Stock Price: " + entry.getValue());
        }

    }

}
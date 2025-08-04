import java.util.HashMap;
import java.util.Map;

public class RemoveHashMap {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 100);
        stockPrice.put("Fiserv", 200);
        stockPrice.put("BMW", 300);
        stockPrice.put("Microsoft", 400);

        //This will remove Oracle from the Map and return 100
        System.out.println(stockPrice.remove("Oracle"));

        //This will return null as Google is not present in the Map
        System.out.println(stockPrice.remove("Google"));

        //This will return false because the value passed does not match the value of BMW in the Map
        System.out.println(stockPrice.remove("BMW", 45));


    }
}

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("USA", 3);
        map.put("China", 5);
        map.put("Russia", 6);

        //This will increment the value of India by 1 as its present in the Map
        map.computeIfPresent("India", (k, v) -> v == null ? 10 : v + 1);

        //This will not insert Vietnam in the Map
        map.computeIfPresent("Vietnam", (k,v) -> v == null ? 10 : v + 1);

        System.out.println(map);
    }


}

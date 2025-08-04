import java.util.Map;
import java.util.HashMap;

public class IsEmptyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("abc", 23);
        map.put("def", 24);
        map.put("ghi", 25);

        System.out.println(map.isEmpty());
    }

}

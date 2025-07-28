import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMaps {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>(){{
            put("A", 1);
            put("B", 2);
            put("C", 3);
        }};
        map.forEach((key, value) -> System.out.println(key + " | " + value));
        System.out.println(map.putIfAbsent("C" , 6));
        System.out.println(map.putIfAbsent("E" , 5));
        map.replaceAll((key,value) -> List.of("A","B").contains(key) ? 0 : value);
        System.out.println(map.get("A"));
        map.compute("D",(key,value) -> value + value);
        System.out.println(map.get("D"));
        map.merge("C", 9, (oldVal, newVal) -> oldVal + newVal);
        System.out.println(map.get("C"));


    }
}

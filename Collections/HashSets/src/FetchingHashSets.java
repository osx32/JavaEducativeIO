import java.util.HashSet;
import java.util.Set;

public class FetchingHashSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(12);
        set.add(87);

        System.out.println(set.contains(32));
        System.out.println(set.contains(1));
    }
}

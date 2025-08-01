import java.util.HashSet;
import java.util.Set;


public class IsEmptyHashSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(42);
        set.add(56);

        System.out.println(set.isEmpty());
    }

}

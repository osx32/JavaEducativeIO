import java.util.HashSet;
import java.util.Set;

public class RemoveAndClear {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(45);
        set.add(98);

        set.remove(23);
        System.out.println("HashSet after removing one element" + set);

        set.clear();
        System.out.println("HashSet after removing all elements" + set);

    }
}

import java.util.HashSet;
import java.util.Set;

public class IterationAndSortingHashSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(34);
        set.add(56);

        for(int i : set){
            System.out.println(i);
        }
    }
}

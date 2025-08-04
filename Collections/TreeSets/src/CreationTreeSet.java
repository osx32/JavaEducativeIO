import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CreationTreeSet {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(81);
        list.add(62);
        list.add(33);
        list.add(14);
        list.add(19);

        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println("TreeSet elements in ascending order " + set);
    }
}
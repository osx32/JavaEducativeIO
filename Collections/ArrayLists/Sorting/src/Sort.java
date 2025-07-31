import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(15);
    list.add(11);
    list.add(36);
    list.add(28);
    list.add(3);

    Collections.sort(list);
    System.out.println("ArrayList in asc order: " + list);
    }
}
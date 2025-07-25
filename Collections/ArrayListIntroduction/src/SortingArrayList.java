import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SortingArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(29);
        list.add(15);
        list.add(3);
        list.add(46);
        list.add(23);

        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("ArrayList in asc order: " + sortedList);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(36);
        list.add(28);
        list.add(3);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("ArrayList in asc order: " + sortedList);
    }
}

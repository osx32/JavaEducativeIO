import java.util.*;
import java.util.stream.Collectors;

public class CollectingAndThen {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("far");
        list.add("away");
        list.add("done");

        List<String> unmodifiableList = list.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(unmodifiableList);

    }

}

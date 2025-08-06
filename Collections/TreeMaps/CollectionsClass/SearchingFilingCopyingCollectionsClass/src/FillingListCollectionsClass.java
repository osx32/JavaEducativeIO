import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingListCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(56);
        list.add(78);

        Collections.fill(list,10);

        System.out.println(list);
    }

}

import java.util.ArrayList;
import java.util.List;

public class Introduction {
    public static void main(String[] args) {
        List list1 = new ArrayList(50);
        List list2 = new ArrayList(list1);
        List list3 = new ArrayList();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3,list3);
        System.out.println(list2);
        list2.add(0,4);
        System.out.println(list2);
    }
}

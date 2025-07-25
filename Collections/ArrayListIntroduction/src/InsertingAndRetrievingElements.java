import java.util.ArrayList;
import java.util.List;

public class InsertingAndRetrievingElements {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        System.out.println(list);
//
//        list.remove(1); // This will remove the element at index 1 is 20
//        System.out.println(list);
//
//        list.remove(new Integer(30)); // This will remove 30 from the list
//        System.out.println(list);
//
//        list.clear(); // This will remove all the elements from the list
//        System.out.println(list);

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");

        list.replaceAll((element) -> element.toUpperCase());

        System.out.println(list);
    }
}

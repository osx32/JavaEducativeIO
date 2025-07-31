import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); // This will add 4 at the end of the list
        System.out.println(list);

        //This will add 50 at index 1. All the other elements will be shifted to right.
        list.add(1, 50);

        List newList  = new ArrayList(); // Creating a new list which will be added to origial list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList);  //This will add all the elements present in newList to list.
        System.out.println(list);

    }
}
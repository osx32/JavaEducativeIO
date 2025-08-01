import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(31);
        linkedList.add(72);
        linkedList.add(13);
        linkedList.add(94);
        linkedList.add(15);
        linkedList.add(65);
        linkedList.add(17);

        Collections.sort(linkedList);
        System.out.println(linkedList);
    }
}

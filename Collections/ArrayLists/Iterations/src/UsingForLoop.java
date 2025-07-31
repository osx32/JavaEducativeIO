import java.util.ArrayList;
import java.util.List;

public class UsingForLoop {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
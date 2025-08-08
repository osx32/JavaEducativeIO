import java.util.ArrayList;
import java.util.List;

public class InstanceMethodObject {
    public int getLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("word");
        list.add("practice");
        list.add("fake");

        InstanceMethodObject demo = new  InstanceMethodObject();
        //Code without instance method reference
        list.stream()
                .mapToInt(str -> demo.getLength(str))
                .forEach(System.out::println);

        //Code with instance method reference
        list.stream()
                .mapToInt(demo::getLength)
                .forEach(System.out::println);
    }
}

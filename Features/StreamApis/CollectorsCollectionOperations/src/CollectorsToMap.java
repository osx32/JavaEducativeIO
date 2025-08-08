//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class CollectorsToMap {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("done");
//        list.add("far");
//        list.add("away");
//        list.add("again");
//
//        Map<String, Integer> nameMap = list.stream()
//                .collect(Collectors.toMap(s -> s, s -> s.length()));
//
//        System.out.println(nameMap);
//    }
//}


//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class CollectorsToMap{
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("done");
//        list.add("far");
//        list.add("away");
//        list.add("done");
//
//        Map<String, Integer> nameMap = list.stream()
//                .collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s1));
//
//        System.out.println(nameMap);
//    }
//}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("far");
        list.add("away");
        list.add("done");

        Map<String, Integer> nameMap = list.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length(), (s1, s2) -> s1, HashMap::new));

        System.out.println(nameMap);
    }
}
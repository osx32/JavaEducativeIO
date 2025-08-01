import java.util.*;
import java.util.HashSet;


public class ExerciseHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Integer[] array1 = {12, 34, 1, 56, 43, 34, 65};
        int duplicate=0;

        for(int i : array1){
            if(!set.add(i)){
                duplicate = i;
                break;
            }
        }

        System.out.println(duplicate);
    }
}

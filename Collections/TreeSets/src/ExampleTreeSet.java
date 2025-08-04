import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};

        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int number : numbers){
            treeSet.add(number);
        }

        System.out.println("Fetching all the elements greater than 50 " + treeSet.tailSet(new Integer(50)));
        System.out.println("Fetching all the elements first number " + treeSet.first());
        System.out.println("Fething all the elements last number " + treeSet.last());

    }

}

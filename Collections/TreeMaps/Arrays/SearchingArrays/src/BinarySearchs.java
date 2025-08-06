import java.util.Arrays;

public class BinarySearchs {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is " + index);

        int index2 = Arrays.binarySearch(numbers, 5, 9, 4);
        System.out.println("The index  of element 4 in the array is " + index2);

        int index3 = Arrays.binarySearch(numbers, 1, 5, 4);
        System.out.println("The index of element 4 in the array is " + index3);

    }
}
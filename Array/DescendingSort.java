import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DescendingSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 10, 1};
        
        // Sorting the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        
        // Printing the sorted array
        System.out.println("Array sorted in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
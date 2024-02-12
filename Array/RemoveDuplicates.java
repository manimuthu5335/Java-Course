import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] array = {1, 2, 3, 4, 2, 3, 5};
        
        // Remove duplicates and get unique array
        int[] uniqueArray = removeDuplicates(array);
        
        // Print original and unique arrays
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
    
    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        
        // Add elements to the set, duplicates will be automatically removed
        for (int num : array) {
            set.add(num);
        }
        
        // Create a new array to store unique elements
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        
        // Convert set to array
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        
        return uniqueArray;
    }
}
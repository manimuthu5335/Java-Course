import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 5}; // Example array
        int elementToRemove = 3; // Element to remove
        System.out.println("Original array: " + Arrays.toString(array));

        // Remove specific element or all occurrences of an element
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                array[count++] = array[i];
            }
        }

        if (count == array.length) {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        } else {
            int[] newArray = Arrays.copyOf(array, count);
            System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(newArray));
        }
    }
}
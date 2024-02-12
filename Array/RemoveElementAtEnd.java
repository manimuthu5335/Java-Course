import java.util.Arrays;

public class RemoveElementAtEnd {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        System.out.println("Original array: " + Arrays.toString(array));

        // Removing the last element
        if (array.length > 0) {
            int[] newArray = Arrays.copyOf(array, array.length - 1);
            System.out.println("Array after removing the last element: " + Arrays.toString(newArray));
        } else {
            System.out.println("Cannot remove element, array is empty.");
        }
    }
}
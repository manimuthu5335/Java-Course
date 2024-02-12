import java.util.Arrays;

public class RemoveElementAtBeginning {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        System.out.println("Original array: " + Arrays.toString(array));

        // Removing the first element
        if (array.length > 0) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 1, newArray, 0, newArray.length);
            System.out.println("Array after removing the first element: " + Arrays.toString(newArray));
        } else {
            System.out.println("Cannot remove element, array is empty.");
        }
    }
}
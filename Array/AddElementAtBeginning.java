import java.util.Arrays;

public class AddElementAtBeginning {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToAdd = 0; // Element to add at the beginning

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Add element at the beginning
        array = addElementAtBeginning(array, elementToAdd);

        // Display the modified array
        System.out.println("Array after adding element at the beginning: " + Arrays.toString(array));
    }

    public static int[] addElementAtBeginning(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = element;
        System.arraycopy(array, 0, newArray, 1, array.length);
        return newArray;
    }
}
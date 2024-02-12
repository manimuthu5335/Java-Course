import java.util.Arrays;

public class AddElementToEnd {
    public static void main(String[] args) {
        // Existing array
        int[] originalArray = {1, 2, 3, 4, 5};

        // New element to add
        int newElement = 6;

        // Create a new array with increased size
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);

        // Add the new element at the end
        newArray[newArray.length - 1] = newElement;

        // Print the new array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array with Element Added at the End: " + Arrays.toString(newArray));
    }
}
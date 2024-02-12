import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};
        
        // Elements to swap (indices)
        int index1 = 1;
        int index2 = 3;
        
        // Print original array
        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Swap elements
        swapElements(array, index1, index2);
        
        // Print array after swapping
        System.out.println("Array after swapping: " + Arrays.toString(array));
    }
    
    public static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}








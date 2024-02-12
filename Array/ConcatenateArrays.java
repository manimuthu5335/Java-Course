import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        
        // Determine the length of the concatenated array
        int length = arr1.length + arr2.length;
        
        // Create a new array with the determined length
        int[] result = new int[length];
        
        // Copy elements of arr1 to result
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        
        // Copy elements of arr2 to result
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        
        // Printing the concatenated array
        System.out.println("Concatenated Array:");
        System.out.println(Arrays.toString(result));
    }
}
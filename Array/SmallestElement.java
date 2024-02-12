public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 8, 15}; // Example array
        int smallest = findSmallest(array);
        System.out.println("The smallest element in the array is: " + smallest);
    }
    
    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
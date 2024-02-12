public class LargestElement {
    public static void main(String[] args) {
        int[] array = {10, 25, 7, 35, 18};
        int largest = array[0]; // Assume the first element is the largest

        // Iterate through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
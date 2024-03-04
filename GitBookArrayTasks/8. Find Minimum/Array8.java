public class Array8 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 35, 18};
        int smallest= numbers[0]; // Assume the first element is the smallest

        // Iterate through the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest element in  Array : " + smallest);
    }
}
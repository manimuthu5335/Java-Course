public class Array7 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 35, 18};
        int largest = numbers[0]; // Assume the first element is the largest

        // Iterate through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element in  Array : " + largest);
    }
}
public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double sum = 0;
        
        // Loop through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // Calculate the average
        double average = sum / array.length;
        
        System.out.println("The average of all elements in the array is: " + average);
    }
}
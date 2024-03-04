public class Array6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        // Calculate the average
        double average = sum / numbers.length;
        
        System.out.println(" Average of Array : " + average);
    }
}
public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30};
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }
    
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        
        return secondSmallest;
    }
}
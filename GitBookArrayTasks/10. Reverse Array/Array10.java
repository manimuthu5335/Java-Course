public class Array10 {  
    public static void main(String[] args) {  
        
        int [] numbers =  {1, 2, 3, 4, 5};  
        System.out.println("Original array: ");  
        for (int i = 0; i < numbers.length; i++) {  
            System.out.print(numbers[i] + " ");  
        }  
       
        System.out.println("\nArray in reverse order: ");  
        
        for (int i = numbers.length-1; i >= 0; i--) {  
            System.out.print(numbers[i] + " ");  
        }  
    }  
}  
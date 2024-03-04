
public class Array9 { 
	public static void main(String[] args) 
	{ 
		int []numbers = { 1, 2, 3,4,5 }; 

		
		int []copyNumbers = new int[numbers.length]; 
       
		      copyNumbers = numbers;
                    
		 System.out.println("Original Array "); 
		for (int i = 0; i < numbers.length; i++) 
		System.out.print(numbers[i] + " "); 

		System.out.println("\n\nCopied of Array "); 
		for (int i = 0; i < copyNumbers.length; i++) 
		System.out.print(copyNumbers[i] + " "); 
	} 
}

class Array3{
 public static void main(String[]args){
   int[]numbers = {1,2,3,4,5};
    System.out.println("Original Array");
   for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }

   if(numbers.length>=2){
   numbers[1] = 10;     
          System.out.println("------------------------------------------------");
   System.out.println("Changing 2nd element :" +numbers[1]);
System.out.println("------------------------------------------------");
}
   else{
    System.out.println("Array doesn't have 2nd element!");
}

   
 for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
   
 
}

}
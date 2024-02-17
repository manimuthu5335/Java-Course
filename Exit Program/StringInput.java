import java.io.Console;

public class StringInput {
    public static void main(String[] args) {
        Console console=System.console();
        String input;

        do {
            System.out.print("Enter a string (type 'exit' to quit): ");
             input=console.readLine();
        } 
          while (!input.toLowerCase().contains("exit"));

        
        System.out.println("Exiting done!");
       
    }
}
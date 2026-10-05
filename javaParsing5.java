import java.util.Scanner;

public class javaParsing5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String input = scanner.nextLine();

        try {
         
            Integer.parseInt(input);
            System.out.println("Valid number");
            } 
        catch (NumberFormatException e) {
           
            System.out.println("Invalid number");
        }

        scanner.close();
    }
}

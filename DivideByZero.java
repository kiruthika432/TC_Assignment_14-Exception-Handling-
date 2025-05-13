//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the numerator integer: ");
            int numerator = Integer.parseInt(input.nextLine());

            System.out.println("Enter the denominator integer: ");
            int denominator = Integer.parseInt(input.nextLine());

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException ae){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(NumberFormatException nfe){
            System.out.println("Error: Please enter valid integers only.");
        }
        catch(Exception e){
            System.out.println("An unexpected error occured: " + e.getMessage());
        }
        finally{
            input.close();
            System.out.println("Program ends");
        }
    }
}
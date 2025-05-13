import java.util.Scanner;

class InvalidDivisionException extends Exception{
    public InvalidDivisionException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter numerator integer: ");
            int numerator = input.nextInt();

            System.out.println("Enter the denominator integer: ");
            int denominator = input.nextInt();

            if(denominator <= 0){
                throw new InvalidDivisionException("Denominator must be greater than zero");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch(InvalidDivisionException ide){
            System.out.println("Custom Exception Caught: " + ide.getMessage());
        }
        catch(NumberFormatException nfe){
            System.out.println("Error: Please enter valid integers only");
        }
        catch(Exception e){
            System.out.println("Unexpected error: " + e.getMessage());
        }
        finally{
            input.close();
            System.out.println("Program ends");
        }
    }
}

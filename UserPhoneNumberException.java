import java.util.InputMismatchException;
import java.util.Scanner;

public class UserPhoneNumberException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter your phone number: ");

            long phoneNumber = input.nextLong();

            if(String.valueOf(phoneNumber).length() != 10){
                System.out.println("Warning: Phone number should typically be 10 digits.");
            }

            System.out.println("Phone number entered: " + phoneNumber);
        }
        catch(InputMismatchException ime){
            System.out.println("Error: Invalid input. Please enter digits only.");
        }
        finally{
            input.close();
            System.out.println("Program ends");
        }
    }
}

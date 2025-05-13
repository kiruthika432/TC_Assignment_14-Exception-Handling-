import java.util.Scanner;

public class ArrayIndexException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = {10,20,30,40,50};

        System.out.println("Array Elements: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        try{
            System.out.println("Enter the index to access: ");
            int index = Integer.parseInt(input.nextLine());

            int value = numbers[index];
            System.out.println("value at index " + index + " is: " + value);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Error: Index out of bounds. Please enter a value between 0 and " +(numbers.length -1));
        }
        catch(NumberFormatException ex){
            System.out.println("Error: Please enter a valid integer index.");
        }
        finally{
            input.close();
            System.out.println("Program ends");
        }
    }
}

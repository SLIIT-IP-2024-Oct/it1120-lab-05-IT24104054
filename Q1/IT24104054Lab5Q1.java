import java.util.Scanner;

public class IT24104054Lab5Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare three variables to hold the input integers
        int num1, num2, num3;

        // Ask the user to enter three integers
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();
        
        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();

        // Calculate the largest and smallest number using conditional checks
        int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        int smallest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        // Display the results
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

       
    }
}

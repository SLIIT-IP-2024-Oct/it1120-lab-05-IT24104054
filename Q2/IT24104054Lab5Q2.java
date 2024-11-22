import java.util.Scanner;

public class IT24104054Lab5Q2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variable for number of new members
        int numNewMembers;

        // Ask the user to enter the number of new members
        System.out.print("Enter the number of new members introduced: ");
        numNewMembers = input.nextInt();

        // Validate the input
        if (numNewMembers < 0) {
            System.out.println("Invalid number. The number of new members must be greater than or equal to 0.");
        } else {
            // Use switch statement to determine the prize based on the number of new members
            String prize;
            switch (numNewMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Display the prize
            System.out.println("The customer is entitled to a: " + prize);
        }

       
    }
}

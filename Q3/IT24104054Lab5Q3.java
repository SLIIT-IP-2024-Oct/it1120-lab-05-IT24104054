import java.util.Scanner;

public class IT24104054Lab5Q3 {
    // Declare constants for room charges and discount rates
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_4_DAYS = 10;  // Discount for 3-4 days
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;  // Discount for 5 or more days
    public static final int MIN_DATE = 1;  // Minimum valid day
    public static final int MAX_DATE = 31; // Maximum valid day
    
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Declare variables for the start date and end date
        int startDate, endDate;
        
        // Ask for the start date and end date of the reservation
        System.out.print("Enter the start date (1-31): ");
        startDate = input.nextInt();
        
        System.out.print("Enter the end date (1-31): ");
        endDate = input.nextInt();

        // Validation 1: Check if the start date and end date are within valid range
        if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Date must be between 1 and 31.");
            return; // Exit the program if invalid date is entered
        }

        // Validation 2: Check if start date is less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            return; // Exit the program if start date is not less than end date
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate ;
        
        // Calculate the total room charges
        int totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        
        // Apply discount based on the number of days reserved
        int discount = 0;
        if (numberOfDays >= 5) {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        } else if (numberOfDays >= 3) {
            discount = DISCOUNT_3_4_DAYS;
        }
        
        // Calculate the final amount after applying the discount
        int discountAmount = (totalAmount * discount) / 100;
        int finalAmount = totalAmount - discountAmount;

        // Display the results
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Room Charge Per Day: " + ROOM_CHARGE_PER_DAY);
        System.out.println("Total amount to be paid: Rs " + finalAmount);

        
    }
}

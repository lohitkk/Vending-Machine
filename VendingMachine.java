import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Display message for user choices
        System.out.println("Press 1 for juice or 2 for soda.");

        // Ask the user for their choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Use an if statement to check the choice
        if (choice == 1) {
            System.out.println("Dispensing juice.");
        } else if (choice == 2) {
            System.out.println("Dispensing soda.");
        } else {
            System.out.println("Invalid choice.");
        }

        // Close the scanner
        scanner.close();
    }
}

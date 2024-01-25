import java.util.Scanner;

// Multiplicationtable class
public class Multipicationtable {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        // Reading the entered number from the user
        int number = scanner.nextInt();

        scanner.close();

        // using the if else condition
        if (number <= 0) {
            // Displaying a message
            System.out.println("Please re-enter a positive integer.");
        } else {
            System.out.println("Multiplication Table for " + number + ":");

            // Using for loop
            for (int i = 1; i <= 20; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}

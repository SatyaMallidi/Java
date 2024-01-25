import java.util.Scanner;

// Cubeofnumber class
public class Cubeofnumber {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");

        int x = scanner.nextInt();

        // using if condition
        if (x > 0) {
            // Calculating the cube of the positive number
            int cube = x * x * x;

            // Displaying the result
            System.out.println("The cube of " + x + " is: " + cube);
        } else {
            //  if the entered number is not positive
            System.out.println("Please enter a positive number.");
        }
        scanner.close();
    }
}

import java.util.Scanner;

// HighestVariable class
public class HighestVariable {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int z = scanner.nextInt();

        // Variable to store the largest number
        int largestNumber;

        // using else if condition
        if (x >= y && x >= z) {
            largestNumber = x;
        } else if (y >= x && y >= z) {
            largestNumber = y;
        } else {
            largestNumber = z;
        }

        // Displaying the largest number to the user
        System.out.println("The largest number is: " + largestNumber);

        scanner.close();
    }
}

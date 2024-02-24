import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberTypeExampleWithTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of iterations to be checked : ");
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                System.out.println("Enter the number to be checked : ");
                int number = scanner.nextInt();

                if (number > 0) {
                    System.out.println("The number is positive.");
                } else if (number < 0) {
                    System.out.println("The number is negative.");
                } else {
                    System.out.println("The number is zero.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }

            scanner.close();
        }
    }



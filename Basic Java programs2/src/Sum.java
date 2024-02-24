import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two digit number");
        int num = scanner.nextInt();
        int tens1 = num / 10; // Extract the tens digit
        int ones1 = num % 10; // Extract the units digit
        int Sum1 = tens1 + ones1;
        if (num >= 10 && num <= 99) {
                System.out.println("Sum of the two digits: " + Sum1);
            } else {
                System.out.println("Please enter a double-digit number.");

        }
        System.out.println("Enter the three digit number :");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens2 = (number/10)%10;
        int ones2 = (number%10);
        int sum2 = hundreds + tens2 + ones2;
        if (number >= 100 && number <=999){
            System.out.println("Sum of the three digits: " + sum2);
        } else {
            System.out.println("Please enter a double-digit number.");

        }

    }
}

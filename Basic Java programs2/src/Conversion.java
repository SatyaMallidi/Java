import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Farenheit value :");
        double F = scanner.nextDouble();
        double C = (F - 32) * 5 / 9;
        System.out.println("The given Farenheit value of " + F + " is " + C);

        System.out.println("Enter the kilometers per hour value ");
        double KMPH= scanner.nextDouble();
        double MPH = KMPH / 1.60934;
        System.out.println("The MPH value of " + KMPH+" is "+ MPH);

    }
}


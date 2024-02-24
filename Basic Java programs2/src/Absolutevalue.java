import java.util.Scanner;
public class Absolutevalue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = scanner.nextInt();
        int absoluteValue = Math.abs(value);
        System.out.println("The absolute value of " + value + " is " + absoluteValue );
    }
}

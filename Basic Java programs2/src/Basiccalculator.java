import java.util.Scanner;
public class Basiccalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
      System.out.println("Addition is :" +add);
      System.out.println("Subtraction is :" +sub);
      System.out.println("Multipication is :" +mul);
      System.out.println("Division is :" +div);
      System.out.println("Remainder is :" +rem);



    }
}

import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year");
        int x = scanner.nextInt();
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println(x + " is a leap year.");
        } else {
            System.out.println(x + " is not a leap year.");
        }
    }
}

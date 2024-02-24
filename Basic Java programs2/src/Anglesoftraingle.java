import java.util.Scanner;
public class Anglesoftraingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first angle");
        int x = scanner.nextInt();
        System.out.println("Enter the second angle");
        int y = scanner.nextInt();
        System.out.println("Enter the third angle");
        int z = scanner.nextInt();
        if (x + y + z == 180) {
            System.out.println("the entered angles are formimg traingle");
        } else {
            System.out.println("the entered angles are not formimg traingle");
        }
        if(x == y && y == z){
            System.out.println("The traingle is Equilateral");
        }
            else if (x == y || y == z || x == z) {
            System.out.println("The traingle is Isoscles");
        }
            else{
                System.out.println("The traingle is Scalane");


            }

        }
    }

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for each subject:");

        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int sub3 = scanner.nextInt();
        int sub4 = scanner.nextInt();
        int sub5 = scanner.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("The total marks of students is: " + total);

        System.out.println("maximum Marks Per each Subject:");
        int maxmarks = scanner.nextInt();

        double x = ((double) total / (5 * maxmarks)) * 100;
        System.out.println("The percentage is: " + x);

        if (x >= 90) {
            System.out.println("Grade A");
        } else if (x >= 70 && x < 90) {
            System.out.println("Grade B");
        } else if (x >= 50 && x < 70) {
            System.out.println("Grade C");
        } else if (x >= 30 && x < 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}

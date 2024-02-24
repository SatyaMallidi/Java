import java.util.Scanner;
public class Monthnumbername {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number between 1 - 12");
        int x = scanner.nextInt();
        switch(x){
            case 1:
                System.out.println("The month name is January");
                break;
            case 2:
                System.out.println("The month name is February");
                break;
            case 3:
                System.out.println("The month name is March");
                break;
            case 4:
                System.out.println("The month name is April");
                break;
            case 5:
                System.out.println("The month name is May");
                break;
            case 6:
                System.out.println("The month name is June");
                break;
            case 7:
                System.out.println("The month name is July");
                break;
            case 8:
                System.out.println("The month name is August");
                break;
            case 9:
                System.out.println("The month name is September");
                break;
            case 10:
                System.out.println("The month name is October");
                break;
            case 11:
                System.out.println("The month name is November");
                break;
            case 12:
                System.out.println("The month name is December");
                break;
            default:
                System.out.println("please enter the valid number");

        }

    }

}


import java.util.Scanner;

public class Monitoringspeed {
    private static final int MAX_CARS = 100;
    private static int speeds[]=new int[MAX_CARS];
    private static int speedcount;
    private static final double SPEED_LIMIT = 100.0;
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        int choice;
        do{
            System.out.println("\n1.Add a new Speed");
            System.out.println("2.Calculating Average Speed of cars");
            System.out.println("3.Maximum Speed Recorded");
            System.out.println("4.cars exceed the speed limit (assume 100 km/h)");
            System.out.println("5.Exit the system");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:addSpeed();
                break;
                case 2:int avgspeed = calculatingaveragespeed();
                System.out.println("the average speed of cars is : " + avgspeed);
                break;
                case 3:int maximumspeed = calculatingMaximumspeed();
                System.out.println("The maximum speed of car is : "+ maximumspeed);
                break;
                case 4:int abovespeed = calculatingabovespeed();
                System.out.println("The cars which are above the speed limit are :"+abovespeed);
                break;
                case 5:System.out.println("Exit the program");
                break;
                default:
                    System.out.println("Enter the valid choice number");
            }

        }
        while(choice !=5);
            scanner.close();
    }
    private static void addSpeed(){
        int speed = scanner.nextInt();
        speeds[speedcount] = speed;
        speedcount++;
        System.out.println("Speed updated");
    }
    private static int calculatingaveragespeed(){
        int avgspeed = 0;
        for(int i=0;i<speedcount;i++) {
            avgspeed += speeds[i];
        }
            if(speedcount>0){
                avgspeed/=speedcount;
            }
        return avgspeed;
    }
    private static int calculatingMaximumspeed(){
       int maximumspeed = 0;
       for(int i=0;i<speedcount;i++){
           if(speeds[i]>maximumspeed){
               maximumspeed=speeds[i];
           }
       }
       return maximumspeed;
    }
    private static int calculatingabovespeed(){
        int abovespeed=0;
        for(int i=0;i<speedcount;i++){
            if(speeds[i]>SPEED_LIMIT){
                abovespeed++;
            }
        }
        return abovespeed;
    }
}

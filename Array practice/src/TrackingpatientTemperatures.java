import java.util.Scanner;
public class TrackingpatientTemperatures {
    private static double temperatures[] = new double[100];
    private static double temperaturecount;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1.Add a new Temperature");
            System.out.println("2.Calculating Average Temperature of Patients ");
            System.out.println("3.Highest Temperature Recorded");
            System.out.println("4.Patients with Temperature above 37.5 degree");
            System.out.println("5.Exit the system");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: addTemperature();
                break;
                case 2:double avgTemp = averageTemperature();
                System.out.println("The Average Temperature of Patients is : "+ avgTemp);
                break;
                case 3:double hitemp = highestTemperature();
                System.out.println("Highest temperature recorded is : "+ hitemp);
                break;
                case 4:calculatingaboveTemperature();
                break;
                case 5: System.out.println("Exit the program");
                break;
                default:
                    System.out.println("Enter the valid choice");
            }
        }
        while (choice != 5);
        scanner.close();
    }

    private static void addTemperature() {
        double temp = scanner.nextDouble();
        temperatures[(int)temperaturecount] = temp;
        temperaturecount++;
        System.out.println("Temperature recorded successfully");

    }

    private static double averageTemperature() {
        double avgTemp = 0;
        for (int i = 0; i < temperaturecount; i++) {
            avgTemp += temperatures[i];
        }
        if (temperaturecount > 0) {
            avgTemp /= temperaturecount;
        }
        return avgTemp;
    }

    private static double highestTemperature(){
        double hiTemp = 0;
        for(int i=0;i<temperaturecount;i++){
            if(temperatures[i]>hiTemp){
                hiTemp = temperatures[i];
            }
        }
        return hiTemp;
    }

    private static void calculatingaboveTemperature(){
        double aboveTemp = 37.5;
        for(int i=0;i<temperaturecount;i++){
            if(temperatures[i]>=37.5){
                System.out.println("The temperatures above 37.5 are :" + temperatures[i]);
            }
        }
    }


}

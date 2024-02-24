public class Vehicle {
    String make;
    String model;
    int year;
    void start(){

    }
    void vehicleDetails(String make,String model,int year){
        System.out.printf("%-10s%-10s%-10s%n","Make","Model","Year");
        System.out.printf("%-10s%-10s%-10s%n",make,model,year);
    }
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleDetails("Maruthi","Shift",2024);

    }
}

public class Vehicle {
    protected String name;
    protected String make;
    protected String model;

    public Vehicle(String name,String make,String model){
        this.name=name;
        this.make=make;
        this.model=model;
    }
     public void vehicleDetails(){
        System.out.println("The Vehicle details are :");
         System.out.println("The vehicle name is :" + name);
         System.out.println("The make of vehicle is :"+make);
         System.out.println("The model of Vehicle is :"+model);
     }
}
class Car extends Vehicle{
    protected int seatingCapacity;
    public Car(String name,String make,String model,int seatingCapacity){
        super(name,make,model);
        this.seatingCapacity=seatingCapacity;
    }
    public void seating(){
        System.out.println("The total seating of car " + name + " is :" + seatingCapacity);
    }

}
class Truck extends Vehicle{
    protected int cargoCapacity;
    public Truck(String name,String make,String model,int cargoCapacity){
        super(name,make,model);
        this.cargoCapacity=cargoCapacity;
    }
    public void cargo(){
        System.out.println("The total seating of Truck " + name + " is :" + cargoCapacity);
    }
}
class Automobile{
    public static void main(String[] args){
        Car car=new Car("Swift","Maruthi","LX",5);
        car.vehicleDetails();
        car.seating();
        Truck truck=new Truck("Leyland","ashok","Heavy",10);
        truck.vehicleDetails();
        truck.cargo();
    }
}

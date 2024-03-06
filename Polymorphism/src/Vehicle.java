public class Vehicle {
   protected String name;
    protected String model;
    public Vehicle(String name,String model){
        this.name=name;
        this.model=model;
    }
    public void details(){
        System.out.println("The vehicle details are :");
        System.out.println("The vehicle name :"+name);
        System.out.println("The model of vehicle :"+model);
    }
}
class Car extends Vehicle{
     protected int seating;

     public Car(String name,String model,int seating){
         super(name,model);
         this.seating=seating;
    }
    public void details(){
         super.details();
         System.out.println("The seating of the car is :"+seating);
    }
}
class Truck extends Vehicle{
    String loadcapacity;
    public Truck(String name,String model,String loadcapacity){
        super(name,model);
        this.loadcapacity=loadcapacity;
    }
    public void details(){
        super.details();
        System.out.println("The load capacity of the Truck is :"+loadcapacity);
    }
}
class Automobile{
    public static void main(String[] args){
        Car car = new Car("Maruthi","LXA2024",5);
        car.details();
        System.out.println();
        Truck truck = new Truck("Lorry","large","2tonnes");
        truck.details();
    }
}

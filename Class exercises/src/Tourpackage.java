public class Tourpackage {
    int packageID;
    String destination;
    int numofdays;
    double price;
    void updatedPrice(double hikedPrice){
        if(hikedPrice>0){
            price+=hikedPrice;
            System.out.println("The increased price of ticket is " + price);
        }
        else{
            System.out.println("Enter the valid price");
        }
    }
    void packageDetails(){
        System.out.printf("%-12s%-15s%-15s%-12s%n","packageID","destination","numberofdays","price");
        System.out.printf("%-12d%-15s%-15d%-12f%n",packageID,destination,numofdays,price);
    }
    public static void main(String[] args){
        Tourpackage tourpackage = new Tourpackage();
        tourpackage.packageID=5541;
        tourpackage.destination="Hyderabad";
        tourpackage.numofdays=10;
        tourpackage.price=10000;
        tourpackage.packageDetails();
        tourpackage.updatedPrice(2000);
    }
}

public class Product{
    int productID;
    String name;
    double price;
    int quantityinstock;

    void addStock(int stockAdded){
        if(stockAdded > 0){
            quantityinstock += stockAdded;
            System.out.println("Stock added. Updated quantity in stock is : " + quantityinstock);
        }
        else{
            System.out.println("Enter the valid quantity");
        }
    }
    void deductStock(int stockDeducted){
        if((stockDeducted > 0)&&(stockDeducted<=quantityinstock)){
            quantityinstock -= stockDeducted;
            System.out.println("Stock deducted. Updated quantity in stock is : " + quantityinstock);
        }
        else{
            System.out.println("Please enter the valid quantity");
        }
    }
    void displayProduct(){
        System.out.printf("%-15s%-15s%-15s%-15s%n","productID","Productname","price($)","quantityinstock");
        System.out.printf("%-15d%-15s%-15f%-15d%n",productID,name,price,quantityinstock);
    }
    public static void main(String[] args){
        Product product = new Product();
        product.productID = 1;
        product.name = "Mobile";
        product.price = 250.0;
        product.quantityinstock = 50;
        product.addStock(10);
        product.displayProduct();

        product.deductStock(5);
        product.displayProduct();
    }

}

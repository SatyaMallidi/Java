public class Encapsulation {
    private String name;
    private double balance;

    public Encapsulation(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
     public void getName(){
        this.name = name;
     }
     public void getBalance(){
        this.balance = balance;
     }
     public void setName(String newname){
        if(newname != null){
            name = newname;
            System.out.println(name);
        }else{
            System.out.println("Enter the valid string");
        }
    }
    public void setBalance(double newbalance){
        if(newbalance>0){
            balance = newbalance;
            System.out.println(balance);
        }else{
            System.out.println("enter the valid amount");
        }

    }
    public static void main(String[] args){
        Encapsulation encapsulation = new Encapsulation("Satish",15000);
        encapsulation.getName();
        encapsulation.getBalance();
        encapsulation.setName("Satya");
        encapsulation.setBalance(10000);


    }
}

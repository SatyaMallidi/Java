public class Inheritance {
    private String name;
    private double balance;

    public Inheritance(String name,double balance){
        this.name=name;
        this.balance=balance;
    }

    public String getName(){
        return name;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("The "+amount+" is deposited");
        }else{
            System.out.println("Enter the valid amount");
        }
    }

    public void withdrawl(double amount){
        if((amount<=balance)&&(amount>0)){
            balance -= amount;
            System.out.println("The"+amount+" is withdrawed from the account");
        }else
            System.out.println("Enter the valid amount");
    }

    public double getBalance(){
        return balance;
    }

    public void displayBalance(){
        System.out.println("current balance"+balance);
    }
}
 class ChildClass extends Inheritance {
    private double interestRate;
    public ChildClass(String name,double balance,double interestRate){
        super(name,balance);
        this.interestRate=interestRate;
    }
    public void interestCalculator(){
        double interest = getBalance() * interestRate/100;
        System.out.println("The interest amount is "+ interest);
    }

    public static void main(String[] args){

        Inheritance inheritance = new Inheritance("Satya",12000);
        ChildClass bank = new ChildClass("Satya",15000,12);
        System.out.println("Name : "+inheritance.getName());
        inheritance.deposit(5000);
        inheritance.withdrawl(7500);
        System.out.println("balance"+inheritance.getBalance());
        bank.interestCalculator();
     }
 }
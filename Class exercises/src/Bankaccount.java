public class Bankaccount {
    String name;
    int number;
    double balance;
    void deposit(){}
    void withdraw(){}
    void checkBalance(){}
    void accountDetails(String name,int number,double balance){
        System.out.printf("%-15s%-15s%-15s%n","Accountname", "Accountnumber", "Balance");
        System.out.printf("%-15s%-15d%-15f%n",name,number,balance);
    }
    public static void main(String[] args){
        Bankaccount details = new Bankaccount();
        details.accountDetails("Satya",945,100000);

    }
}

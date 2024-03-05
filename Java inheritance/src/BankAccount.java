public class BankAccount {
    protected String accountname;
    protected float balance;

    public BankAccount(float balance,String accountname){
        this.balance=balance;
        this.accountname=accountname;
    }
     public void deposit(float amount){
        if(amount>0){
            balance+=amount;
            System.out.println("The amount added is " + amount + " and the updated balance is "+ balance);
        }
        else
            System.out.println("Enter the valid amount");
     }

     public void withdrawl(float amount) {
         if ((balance>=amount) && (amount > 0)) {
             balance -= amount;
             System.out.println("The amount withdrawed is " + amount + " and the updated balance is " + balance);
         } else
             System.out.println("Please enter the valid amount");
     }

     public void displaybalance(){
        System.out.println("The Updated balance in the account  is "+balance);
     }
}
class SavingAccount extends BankAccount{
    protected float interestRate;
     public SavingAccount(String accountname,float balance,float interestRate){
         super(balance, accountname);
         this.interestRate=interestRate;
     }
      public void interest(float interestRate){
         float interest=balance*interestRate/100;
         System.out.println("THe interest for the balance is "+ interest);
      }
}

class CheckingAccount extends BankAccount{
     protected float monthlyfees;

     public CheckingAccount(String accountname,float balance,float monthlyfees){
         super(balance,accountname);
         this.monthlyfees=monthlyfees;
     }
      public void maintaince(float monthlyfees){
         if(balance>0){
             balance-=monthlyfees;
             System.out.println("THe amount deducted from the balance for maintaince is " + monthlyfees);
         } else
             System.out.println("insufficient funds in account to deduct monthly fees");
      }
}
    class Banking{
    public static void main(String[] args){
        SavingAccount savingaccount = new SavingAccount("Satya",25000,10);
         savingaccount.deposit(5000);
         savingaccount.withdrawl(4000);
         savingaccount.interest(10);
         savingaccount.displaybalance();

        CheckingAccount checkingaccount = new CheckingAccount("Satya",25000,200);
        checkingaccount.maintaince(300);
        checkingaccount.displaybalance();
    }
   }
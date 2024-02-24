import java.util.Scanner;
public class Bankaccount{
  private static double[] transactions = new double[100];
   private static int initialtransaction = 0;
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int choice;
        do{
            System.out.println("\n1. Add a new transaction");
            System.out.println("2. Calculate the total balance");
            System.out.println("3. Find the largest deposit in transaction");
            System.out.println("4. Find the largest withdrawal in transaction");
            System.out.println("5. Exit the transaction");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
           switch(choice){
               case 1 : addTransaction();
               break;

               case 2 :double totalBalance =  calculatingtotalBalance();
                   System.out.println("Total Balance is : " + totalBalance);
               break;

               case 3:double largestDeposit = calculatinglargestDeposit();
                   System.out.println("The largest deposit is : " + largestDeposit);
               break;

               case 4:double largestWithdrawl = calculatinglargestWithdrawl();
                   System.out.println("The largest Withdrawl amount is : " + largestWithdrawl);
               break;

               case 5:
                   System.out.println("Exit the Transaction");
                   break;
               default:System.out.println("Enter the valid choice");
           }

        }
        while(choice != 5);
        scanner.close();
    }

   private static void addTransaction() {
        System.out.println("Enter the amount for transaction (+ve numbers for deposit and -ve for withdrawl)");
        double amount = scanner.nextDouble();
        transactions[initialtransaction] += amount;
        initialtransaction++;
        System.out.println("Transaction added successfully");
    }

    private static double calculatingtotalBalance() {
        double totalBalance = 0;
        for (int i = 0; i < initialtransaction; i++) {
            totalBalance += transactions[i];
            System.out.println(transactions[i]);
        }
        return totalBalance;
    }
   private static double calculatinglargestDeposit(){
        double largestDeposit = 0;
        for(int i=0;i<initialtransaction;i++) {
            if (transactions[i] > largestDeposit) {
                largestDeposit = transactions[i];
            }
        }
        return largestDeposit;

    }
   private static double calculatinglargestWithdrawl(){
        double largestWithdrawl = 0;
        for(int i=0;i<initialtransaction;i++){
            if(transactions[i]<largestWithdrawl){
                largestWithdrawl=transactions[i];
            }
        }
        return largestWithdrawl;
    }
    }
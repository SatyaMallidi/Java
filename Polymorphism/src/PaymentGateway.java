public class PaymentGateway {
    String customername;
    public PaymentGateway(String customername,float amount){
        this.customername=customername;
    }
    public void Payment(String cardnum,int date,int month,int year,double amount){
        System.out.println("The payment initiated for creditcard ");
        System.out.println("Payment completed :"+amount);

    }
    public void Payment(String username,String password,double amount){
        System.out.println("The payment is initiated in paypal");
        System.out.println("Payment completed :"+amount);
    }
    public static void main(String[] args){
        PaymentGateway paymentGateway = new PaymentGateway("Satya",5000);
        paymentGateway.Payment("1234-5678-9000",12,9,2025,1000);
        paymentGateway.Payment("satya@007","123456",5000);
    }
}

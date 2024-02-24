public class Interestcalculator {
    int principle;
    int roi;
    int time;

    void calculateSimpleinterest(int principle,int roi,int time){
        System.out.println("calculated interest is " + (principle*roi*time)/100);
    }
    public static void main(String[] args){
        Interestcalculator interest = new Interestcalculator();
        interest.calculateSimpleinterest(100000,12,3);
    }
}

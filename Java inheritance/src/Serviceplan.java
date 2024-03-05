public class Serviceplan {
    protected String planname;
    protected double plancost;
     public Serviceplan(String planname,double plancost){
         this.planname=planname;
         this.plancost=plancost;
     }
     public void plandetails(){
         System.out.println("Plan Name: " + planname);
         System.out.println("Base Cost: $" + plancost);
     }
     public double monthlycost(){
         return plancost;
     }
}
class Prepaidplan extends Serviceplan{
     int mobiledata;
     public Prepaidplan(String planname,double plancost,int mobiledata){
         super(planname,plancost);
         this.mobiledata=mobiledata;
     }
      public void plandetails(){
         super.plandetails();
         System.out.println("Mobile datalimit :" + mobiledata);
      }

      public double monthlycost(){
         return plancost+((mobiledata>5)?mobiledata-5 *2:0);
      }
}
class Postpaidplan extends Serviceplan{
    float talktime;
    public Postpaidplan(String planname,double plancost,float talktime){
        super(planname,plancost);
        this.talktime=talktime;
    }
    public void plandetails(){
        super.plandetails();
        System.out.println("Talktime : "+talktime+"minutes");
    }
    public double monthlycost(){
        return plancost+( talktime>500 ?(talktime-500)*0.5:0);
    }
}
class telecom{
    public static void main(String[] args){
        Prepaidplan prepaid = new Prepaidplan("MagentaMAX",50,5);
        System.out.println("Prepaid plan details :");
        prepaid.plandetails();
        System.out.println("Monthly cost $:"+prepaid.monthlycost());
        Postpaidplan postpaid = new Postpaidplan("Magenta",100,1000);
        System.out.println("Postpaid plan details :");
        postpaid.plandetails();
        System.out.println("Monthly cost $:"+postpaid.monthlycost());
    }
}

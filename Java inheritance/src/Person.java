public class Person {
    protected String personname;
    protected String address;
    protected int age;
    protected String diagnosis;

    public Person(String personname,String address,int age,String diagnosis){
        this.personname=personname;
        this.address=address;
        this.age=age;
        this.diagnosis=diagnosis;
    }
    public void persondetails(){
        System.out.println("THe details of person are ");
        System.out.println("Patient name :" + personname);
        System.out.println("Patient Address :" + address);
        System.out.println("Patient Age :" + age);
        System.out.println("Problem :" + diagnosis);
    }
}
class Patient extends Person{
    private final int appID;
    public Patient(String personname, String address, int age, String diagnosis, int appID){
        super(personname,address,age,diagnosis);
        this.appID=appID;
    }
    public void schedulingAppointment(){
        System.out.println("THe appointment scheduled sucessfully with ID :" + appID);
    }
}
class Doctors extends Patient{

    String medicalPresription;
    public Doctors(String personname, String address, int age, String diagnosis,String medicalPresription,int appID){
        super(personname,address,age,diagnosis,appID);
        this.medicalPresription=medicalPresription;
    }
    public void prescribingMedicines(){
        System.out.println("THe medicines are prescribed to patients are :" + medicalPresription);
    }
}

class Healthcare{
    public static void main(String[] args){
        Patient patient=new Patient("satya","USA",24,"Headache",101);
        patient.persondetails();
        patient.schedulingAppointment();
        Doctors doctors = new Doctors("Satya","USA",24,"Headache","Dart,Dolo",101);
        doctors.prescribingMedicines();
    }
}

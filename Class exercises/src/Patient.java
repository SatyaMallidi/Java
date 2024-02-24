public class Patient {
    int ID;
    String name;
    String diagnosis;

    void patientInformation(int ID,String name,String diagnosis){
        System.out.printf("%-15s%-15s%-15s%n","Patient ID","Patient Name","Diagnosis");
        System.out.printf("%-15d%-15s%-15s%n",ID,name,diagnosis);
    }
    public static void main(String[] args){
        Patient details = new Patient();
        details.patientInformation(1,"satya","Lucid checkup");
    }

}

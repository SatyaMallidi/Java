import java.time.LocalDate;
public class Member {
    int memberID;
    String name;
    String membershipType;
    LocalDate startdate;

    void upgradeMembership(String newmembershipType){
        membershipType = newmembershipType;
        System.out.println("The new membership type is " + membershipType);
    }
    void memberDetails(){
        System.out.printf("%-10s%-10s%-15s%-15s%n", "memberID", "name", "membershipType", "startdate");
        System.out.printf("%-10d%-10s%-15s%-15s%n", memberID, name, membershipType, startdate);

    }
    public static void main(String[] args){
        Member member = new Member();
        member.memberID=112233;
        member.name="Satya";
        member.membershipType="Weight Gain";
        member.startdate= LocalDate.of(2024,2,12);

        System.out.println("Member initial details are : ");
        member.memberDetails();

        member.upgradeMembership("Fat Loss");

        System.out.println("\nmember new details after upgrading membership are : ");
        member.memberDetails();

    }
}

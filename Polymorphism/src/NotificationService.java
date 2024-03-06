public class NotificationService {

    public void sendNotification(String email, String subject, String body) {
        System.out.println("Sending email to " + email + " with subject: " + subject + " and body: " + body);
    }

    public void sendNotification(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }


    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification("Satya@007.com", "Important Update", "You have scheduled the appointment.");
        System.out.println();
        notificationService.sendNotification("9866484873", "You have a new message.");
        System.out.println();
        notificationService.sendNotification("Satya123", "You have notification");
    }
}

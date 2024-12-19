package notifysystem;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailNotificationFactory();
        factory.notify();

        factory = new SMSNotificationFactory();
        factory.notify();
    }
}

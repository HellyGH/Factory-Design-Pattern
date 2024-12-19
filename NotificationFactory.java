package notifysystem;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void notify() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void notify(Notification notification) {
        NotificationManager.getInstance().sendNotification(notification);
    }
}

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

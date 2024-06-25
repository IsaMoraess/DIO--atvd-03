public abstract class Notification {
    public abstract String getMessage();
}

public class BasicNotification extends Notification {
    private String message;

    public BasicNotification(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public abstract class NotificationDecorator extends Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification decoratedNotification) {
        this.decoratedNotification = decoratedNotification;
    }

    public String getMessage() {
        return decoratedNotification.getMessage();
    }
}

public class UrgentNotificationDecorator extends NotificationDecorator {
    public UrgentNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public String getMessage() {
        return "[URGENTE] " + super.getMessage();
    }
}

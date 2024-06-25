public class Main {
    public static void main(String[] args) {
        // Singleton
        NotificationManager manager = NotificationManager.getInstance();

        // Factory Method
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();

        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification smsNotification = smsFactory.createNotification();

        // Observer
        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(() -> System.out.println("Nova notificação recebida!"));

        notificationService.newNotification(emailNotification);

        // Decorator
        Notification urgentEmail = new UrgentNotificationDecorator(emailNotification);
        manager.sendNotification(urgentEmail);
    }
}

class EmailNotification extends Notification {
    @Override
    public String getMessage() {
        return "Você tem um novo email!";
    }
}

class SMSNotification extends Notification {
    @Override
    public String getMessage() {
        return "Você tem uma nova mensagem SMS!";
    }
}


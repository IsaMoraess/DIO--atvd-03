public class NotificationManager {
    private static NotificationManager instance;

    private NotificationManager() {
        // Construtor privado para prevenir instância múltipla
    }

    public static NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void sendNotification(Notification notification) {
        // Lógica para enviar notificação
        System.out.println("Enviando notificação: " + notification.getMessage());
    }
}

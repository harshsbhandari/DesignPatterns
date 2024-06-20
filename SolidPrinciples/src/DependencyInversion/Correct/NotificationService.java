package DependencyInversion.Correct;

public class NotificationService {
    private MessageSender messageSender;

    public void sendNotification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void inputMessage(String message) {
        messageSender.sendNotification(message);
    }
}

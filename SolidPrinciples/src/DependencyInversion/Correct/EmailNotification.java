package DependencyInversion.Correct;

public class EmailNotification implements MessageSender {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }

}

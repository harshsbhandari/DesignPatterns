package DependencyInversion.Correct;

public class SMSNotification implements MessageSender {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }

}

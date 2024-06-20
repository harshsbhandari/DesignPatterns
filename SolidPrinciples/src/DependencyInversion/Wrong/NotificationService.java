public class NotificationService {
    private SmsSender smsSender = new SmsSender();
    private EmailSender emailSender = new EmailSender();

    public void sendNotification() {
        smsSender.sendSMS("Hi there");
        emailSender.sendEmail("Hi there");
    }
}

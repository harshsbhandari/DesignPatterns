public class Main {
    public static void main(String[] args) throws Exception {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification();
    }
}

// In this example, the NotificationService class is tightly coupled with the EmailSender and SmsSender classes. 
// If we want to add another type of notification sender (e.g., push notification), we need to modify the NotificationService class, which violates the DIP.
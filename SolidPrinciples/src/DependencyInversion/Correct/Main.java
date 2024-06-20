package DependencyInversion.Correct;

public class Main {
    public static void main(String[] args) throws Exception {
        MessageSender emailNotification = new EmailNotification();
        emailNotification.sendNotification("Hi there");

        MessageSender smsNotification = new SMSNotification();
        smsNotification.sendNotification("Hi there");
    }
}

// Abstraction: We created a MessageSender interface that defines a sendMessage
// method.
// Low-Level Modules: Both EmailSender and SmsSender implement the MessageSender
// interface.
// High-Level Module: The NotificationService class depends on the MessageSender
// abstraction, not on concrete implementations. It can work with any class that
// implements the MessageSender interface.

// This design adheres to the DIP because the high-level NotificationService
// class does not depend on the low-level EmailSender and SmsSender classes.
// Instead, both high-level and low-level modules depend on the MessageSender
// abstraction.
// This makes the system more flexible and easier to extend with new types of
// message senders without modifying the NotificationService class.
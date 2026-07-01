package ProgrammingElements.Assessment.Polymorphism;

class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Sending notification to " + recipientName);
        System.out.println("Message: " + message);
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Email Notification Sent");
        System.out.println("Recipient: " + recipientName);
        System.out.println("Message: " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS Notification Sent");
        System.out.println("Recipient: " + recipientName);
        System.out.println("Message: " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification Sent");
        System.out.println("Recipient: " + recipientName);
        System.out.println("Message: " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {

        Notification[] notifications = new Notification[3];

        notifications[0] = new EmailNotification(
                "Rahul",
                "Your order has been shipped."
        );

        notifications[1] = new SMSNotification(
                "Priya",
                "Your OTP is 456789."
        );

        notifications[2] = new PushNotification(
                "Amit",
                "You have a new app update."
        );

        System.out.println("All Sent Notifications:");
        System.out.println();

        for (Notification notification : notifications) {
            notification.sendNotification();
            System.out.println();
        }
    }
}
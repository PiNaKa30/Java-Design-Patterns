package CreationalPatterns.Factory.factories;

import CreationalPatterns.Factory.implementations.EmailNotification;
import CreationalPatterns.Factory.implementations.SmsNotification;
import CreationalPatterns.Factory.interfaces.Notification;

public class StaticMethodNotificationFactory {

    public static Notification getInstance(String type){
        return switch (type.toUpperCase()) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            default -> null;
        };
    }

}

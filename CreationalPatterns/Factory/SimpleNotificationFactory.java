package CreationalPatterns.Factory;

public class SimpleNotificationFactory {

    public static Notification getInstance(String type){
        return switch (type.toUpperCase()) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            default -> null;
        };
    }

}

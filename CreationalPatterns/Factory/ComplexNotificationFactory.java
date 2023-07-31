package CreationalPatterns.Factory;

public class ComplexNotificationFactory {

    public Notification getInstance(String type){
        return switch (type.toUpperCase()) {
            case "SMS" -> new SmsNotification();
            case "EMAIL" -> new EmailNotification();
            default -> null;
        };
    }

}

package CreationalPatterns.Factory;

public class Driver {

    public static void main(String[] args) {

//        SimpleNotificationFactory uses a static method, so no need to create its object.
//        But since it's static, the method cannot be overridden
        Notification simpleNotification = SimpleNotificationFactory.getInstance("SMS");
        simpleNotification.notifyUser();
        simpleNotification = SimpleNotificationFactory.getInstance("Email");
        simpleNotification.notifyUser();

//        ComplexNotificationFactory uses an instance method, so we need to create its object.
//        It can now be overridden by its subclasses
        ComplexNotificationFactory complexNotificationFactory = new ComplexNotificationFactory();
        Notification complexnotification = complexNotificationFactory.getInstance("SMS");
        complexnotification.notifyUser();
        complexnotification = complexNotificationFactory.getInstance("Email");
        complexnotification.notifyUser();

//        In general, if you don't anticipate the need for different variations of the factory's behavior
//        and you want a straightforward, simple solution, the static factory method may be a good choice.
//        It provides a more direct and concise way to create instances.

//        However, if you foresee potential changes in the object creation logic or want to take advantage
//        of polymorphism and dependency injection, an instance factory method can offer more flexibility
//        and maintainability in the long run.
    }
}

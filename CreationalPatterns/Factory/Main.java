package CreationalPatterns.Factory;

public class Main {

    public static void main(String[] args) {

//        StaticMethodNotificationFactory uses a static method, so no need to create its object.
//        But since it's static, the method cannot be overridden
        System.out.println("Static Method Notification Factory Example");
        Notification notification = StaticMethodNotificationFactory.getInstance("SMS");
        notification.notifyUser();
        notification = StaticMethodNotificationFactory.getInstance("Email");
        notification.notifyUser();

//        ExtensibleNotificationFactory uses an instance method, so we need to create its object.
//        It can now be overridden by its subclasses
        System.out.println("Extensible Notification Factory Example");
        ExtensibleNotificationFactory extensibleNotificationFactory = new ExtensibleNotificationFactory();
        notification = extensibleNotificationFactory.getInstance("SMS");
        notification.notifyUser();
        notification = extensibleNotificationFactory.getInstance("Email");
        notification.notifyUser();

//        In general, if you don't anticipate the need for different variations of the factory's
//        behavior, and you want a straightforward, simple solution, the static factory method
//        may be a good choice.
//        It provides a more direct and concise way to create instances.

//        However, if you foresee potential changes in the object creation logic or want to take
//        advantage of polymorphism and dependency injection, an instance factory method can
//        offer more flexibility and maintainability in the long run.

    }
}

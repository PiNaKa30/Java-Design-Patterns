package CreationalPatterns.AbstractFactory;

public class Driver {

    private static ScreenFactory getFactoryByDeviceType(String type){
        return switch (type.toUpperCase()){
            case "ANDROID" -> new AndroidScreenFactory();
            case "IOS" -> new IosScreenFactory();
            default -> null;
        };
    }

    public static void main(String[] args) {
        String device = "Android";
        Application application = new Application(getFactoryByDeviceType(device));
        application.start();
        device = "Ios";
        application = new Application(getFactoryByDeviceType(device));
        application.start();
    }

}

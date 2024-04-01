package CreationalPatterns.Factory.implementations;

import CreationalPatterns.Factory.interfaces.Notification;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");
    }

}

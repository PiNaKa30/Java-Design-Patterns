package CreationalPatterns.Factory.implementations;

import CreationalPatterns.Factory.interfaces.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Email Notification");
    }

}

package BehavioralPatterns.Observer;

public class UploadEventSubscriber implements Subscriber{

    @Override
    public void update(String event, String eventMsg) {
        System.out.println(event + " - Upload Consumer received notification for: " + eventMsg);
    }

}

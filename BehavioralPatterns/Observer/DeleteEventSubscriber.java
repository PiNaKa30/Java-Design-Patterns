package BehavioralPatterns.Observer;

public class DeleteEventSubscriber implements Subscriber{

    @Override
    public void update(String event, String eventMsg) {
        System.out.println(event + " - Delete Consumer received notification for: " + eventMsg);
    }

}

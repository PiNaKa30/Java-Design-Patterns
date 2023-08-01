package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<Subscriber>> subscribersMap = new HashMap<>();

    public EventManager(String... events) {
        for(String event : events)
            subscribersMap.put(event, new ArrayList<>());
    }

    public void subscribe(String event, Subscriber subscriber){
        List<Subscriber> subscriberList = subscribersMap.get(event);
        subscriberList.add(subscriber);
        System.out.println("Subscribed to event: " + event);
    }

    public void unsubscribe(String event, Subscriber subscriber){
        List<Subscriber> subscriberList = subscribersMap.get(event);
        subscriberList.remove(subscriber);
        System.out.println("Unsubscribed from event: " + event);
    }

    public void notifySubscribers(String event, String eventMsg){
        List<Subscriber> subscriberList = subscribersMap.get(event);
        for(Subscriber subscriber : subscriberList)
            subscriber.update(event, eventMsg);
    }

}

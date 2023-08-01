package BehavioralPatterns.Observer;

public class Producer {

    private EventManager eventManager;

    public Producer(){
        eventManager = new EventManager("UPLOAD", "DELETE");
    }

    public void uploadVideo(String videoName){
        System.out.println("Producer uploaded video: " + videoName);
        this.eventManager.notifySubscribers("UPLOAD", videoName);
    }

    public void deleteVideo(String videoName){
        System.out.println("Producer deleted video: " + videoName);
        this.eventManager.notifySubscribers("DELETE", videoName);
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}

package BehavioralPatterns.Observer;

public class Driver {

    public static void main(String[] args) {

        Producer producer = new Producer();
        Subscriber deleteSubscriber = new DeleteEventSubscriber();
        Subscriber uploadSubscriber = new UploadEventSubscriber();

        producer.getEventManager().subscribe("DELETE", deleteSubscriber);
        producer.getEventManager().subscribe("UPLOAD", uploadSubscriber);

        producer.uploadVideo("Video 1");
        producer.deleteVideo("Video 1");
        producer.getEventManager().unsubscribe("UPLOAD", uploadSubscriber);
        producer.uploadVideo("Video 2");
        producer.deleteVideo("Video 2");

    }

}

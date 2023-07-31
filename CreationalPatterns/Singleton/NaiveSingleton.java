package CreationalPatterns.Singleton;

public final class NaiveSingleton {

    private static NaiveSingleton instance;
    private String value;

    private NaiveSingleton(String value) {
        this.value = value;
    }

    public static NaiveSingleton getInstance(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(instance == null)
            instance = new NaiveSingleton(value);
        return instance;
    }

    public String getValue(){
        return this.value;
    }

}
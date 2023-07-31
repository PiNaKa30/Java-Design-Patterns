package CreationalPatterns.Singleton;

public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;
    private String value;

    private ThreadSafeSingleton(String value){
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value){
        ThreadSafeSingleton local =  instance;
        if(local != null)
            return local;
        synchronized (ThreadSafeSingleton.class){
            if(instance == null)
                instance =  new ThreadSafeSingleton(value);
            return instance;
        }
    }

    public String getValue(){
        return this.value;
    }

}

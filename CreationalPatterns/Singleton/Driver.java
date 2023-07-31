package CreationalPatterns.Singleton;

public class Driver {

    public static void main(String[] args) {
//        System.out.println("Single Threaded Naive Singleton");
//        NaiveSingleton a = NaiveSingleton.getInstance("0");
//        NaiveSingleton b = NaiveSingleton.getInstance("1");
//        System.out.println(a.getValue());
//        System.out.println(b.getValue());
//        System.out.println("Multi Threaded Naive Singleton");
//        Thread threadA = new Thread(new ThreadA());
//        Thread threadB = new Thread(new ThreadB());
//        threadA.start();
//        threadB.start();
        System.out.println("Thread Safe Singleton");
        Thread threadC = new Thread(new ThreadC());
        Thread threadD = new Thread(new ThreadD());
        threadC.start();
        threadD.start();
    }

    static class ThreadA implements Runnable{

        @Override
        public void run() {
            NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("A");
            System.out.println(naiveSingleton.getValue());
        }
    }

    static class ThreadB implements Runnable{

        @Override
        public void run() {
            NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("B");
            System.out.println(naiveSingleton.getValue());
        }
    }

    static class ThreadC implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("C");
            System.out.println(threadSafeSingleton.getValue());
        }
    }

    static class ThreadD implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("D");
            System.out.println(threadSafeSingleton.getValue());
        }
    }

}
package MultiThreads.Experiments;

public class ThreadExpt {
    public static void main(String[] args) {
        System.out.println("Main is running");

        Thread1 t1 = new Thread1("Thread1");
        t1.setDaemon(true);
        t1.start(); // will run on the mercy of JVM

        Thread t2 = new Thread(()->{
            
        },"t2");

        System.out.println("Main is exiting");
    }
}

package Threads.G1;

public class Main {
    public static void main(String[] args) {
        System.out.println("main is starting");
//        Thread thread1  = new Thread1();
//        thread1.start(); // will not run immediately. it;s an async operation


        Thread t2 = new Thread(new Thread2());
        t2.start();
        System.out.println("main is ending");
    }
}

package Threads.G1;

public class Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("inside thread1 class "+i);
    }
}

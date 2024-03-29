package pl.pingwit.lec_30.point_4;

public class MyThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();

        /*thread.interrupt();
        System.out.println("isInterrupted=" + thread.isInterrupted());*/

        System.out.println("Hello from main");

        MyThread myThread = new MyThread("MyThread");
        MyThread myThread2 = new MyThread("MyThread");
        System.out.println(myThread.isAlive());
        myThread.start();
        myThread2.start();

        System.out.println("isAlive:" + myThread.isAlive());

        myThread.join();

        System.out.println("isAlive:" + myThread.isAlive());
        System.out.println("Main finished");

        Thread.State state = myThread.getState();
    }
}

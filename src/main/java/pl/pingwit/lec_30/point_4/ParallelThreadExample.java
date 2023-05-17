package pl.pingwit.lec_30.point_4;

public class ParallelThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        String name = thread.getName();

        ParallelThread parallelThread = new ParallelThread("parallel thread");
        parallelThread.start();

        //parallelThread.join();

        System.out.println("Finished: " + name);
    }
}

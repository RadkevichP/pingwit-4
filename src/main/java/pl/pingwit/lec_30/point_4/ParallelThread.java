package pl.pingwit.lec_30.point_4;

public class ParallelThread extends Thread {
    public ParallelThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i=" + i);
        }

        String name = Thread.currentThread().getName();
        System.out.println("Finished: " + name);
    }
}

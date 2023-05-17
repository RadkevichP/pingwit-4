package pl.pingwit.lec_30.point_5.sync;


import pl.pingwit.lec_30.point_5.entity.Stock;

public class EmployeeSynchronizedServiceRunnable implements Runnable {

    private final EmployeeSynchronizedService employeeSynchronizedService;
    private final Stock stock;
    private final Integer quantity;

    public EmployeeSynchronizedServiceRunnable(EmployeeSynchronizedService employeeSynchronizedService, Stock stock, Integer quantity) {
        this.employeeSynchronizedService = employeeSynchronizedService;
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Hello from %s: %d \n", threadName, i);
            employeeSynchronizedService.addSyncMethod(stock);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished: " + threadName);
    }

}

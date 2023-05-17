package pl.pingwit.lec_30.point_5.sync;

import pl.pingwit.lec_30.point_5.entity.Stock;

public class RunnableSyncExample {
    public static void main(String[] args) throws InterruptedException {
        Stock stock = new Stock(0);
        EmployeeSynchronizedService employeeSynchronizedService = new EmployeeSynchronizedService();

        Integer quantity = 100000;
        EmployeeSynchronizedServiceRunnable runnableExampleThread = new EmployeeSynchronizedServiceRunnable(employeeSynchronizedService, stock, quantity); // 20 -> 100 -> 1000 или пока не будет неверный результат

        Thread egorkaTask = new Thread(runnableExampleThread);
        Thread olyaTask = new Thread(runnableExampleThread);

        egorkaTask.start();
        olyaTask.start();
        egorkaTask.join();
        olyaTask.join();

        System.out.println(stock);

        System.out.println("Main finished");
    }

}

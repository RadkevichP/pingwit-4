package pl.pingwit.lec_30.point_5;


import pl.pingwit.lec_30.point_5.entity.Stock;

public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Stock stock = new Stock(0);

        EmployeeServiceRunnable runnableExampleThread = new EmployeeServiceRunnable(stock, 20); // 20 -> 100 -> 1000 или пока не будет неверный результат

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

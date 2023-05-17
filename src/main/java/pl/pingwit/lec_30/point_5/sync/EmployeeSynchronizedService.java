package pl.pingwit.lec_30.point_5.sync;


import pl.pingwit.lec_30.point_5.entity.Stock;

public class EmployeeSynchronizedService {
    public synchronized void addSyncMethod(Stock stock) {
        stock.setQuantity(stock.getQuantity() + 1);
    }

    public void addSyncBlock(Stock stock) {
        synchronized (this) {
            stock.setQuantity(stock.getQuantity() + 1);
        }
    }

    public void addSyncBlockClass(Stock stock) {
        synchronized (EmployeeSynchronizedService.class) {
            stock.setQuantity(stock.getQuantity() + 1);
        }
    }

}

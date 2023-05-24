package pl.pingwit.lec_31.point_8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class LockAccount {

    private static int generator = 1;
    private final Lock lock = new ReentrantLock();
    private int id;
    private int money;

    public LockAccount(int money) {
        this.money = money;
        this.id = generator++;
    }

    public Lock getLock() {
        return lock;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean withDraw(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}

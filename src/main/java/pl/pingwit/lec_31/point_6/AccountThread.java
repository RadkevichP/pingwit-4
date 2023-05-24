package pl.pingwit.lec_31.point_6;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    if (accountFrom.withDraw(10)) {
                        accountTo.add(10);
                    }
                }
            }
        }
    }
}

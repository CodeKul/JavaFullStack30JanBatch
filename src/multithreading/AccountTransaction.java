package multithreading;

public class AccountTransaction {
    private Double availableBalance = 10000.00;

    synchronized void depositMoney(Double amount) {
        availableBalance = availableBalance + amount;
        System.out.println("Amount has been credited to your account.");
        System.out.println("Current Balance: " + availableBalance);
        notify();
    }

    synchronized void withdrawMoney(Double amount) {
        if (availableBalance <= amount) {
            System.out.println("Insufficient Balance");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (availableBalance >= amount) {
            availableBalance = availableBalance - amount;
            System.out.println("Current Available Balance: " + availableBalance);
        }
        System.out.println("Insufficient Balance in account");
    }
}

class AccountTransactionImpl {
    public static void main(String[] args) {
        AccountTransaction accountTransaction = new AccountTransaction();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                accountTransaction.withdrawMoney(15000.0);
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                accountTransaction.depositMoney(1000.0);
            }
        };
        t2.start();

    }
}

public class Thread1 extends Thread {
    Bank bank;

    Thread1(Bank b) {
        this.bank = b;
    }

    @Override
    public void run() {

        synchronized (bank) {
            for (; bank.getAccount() < 20000; bank.setAccount(bank.getAccount() + 2))
                System.out.println("inc: " + bank.getAccount());
        }
    }
}

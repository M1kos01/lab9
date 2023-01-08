public class Thread2 extends Thread {
    Bank bank;

    Thread2(Bank b) {
        this.bank = b;
    }

    @Override
    public void run() {

        synchronized (bank) {
            for (; bank.getAccount() > 1; bank.setAccount(bank.getAccount() - 1))
                System.out.println("dec: " + bank.getAccount());
        }
    }
}

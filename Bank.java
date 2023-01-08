public class Bank {
    private int account = 2;

    public void inc() {
        for (; account < 20000; account+=2)
            System.out.println("inc: " +account);
    }

    public void dec() {
        for (; account > 1; account--)
            System.out.println("dec: " +account);
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}

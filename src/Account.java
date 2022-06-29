public class Account {

    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public boolean debit(double amount) {
        if (amount > this.balance) {
            System.out.println("Amount exceeded");
            return false;
        } else
            this.balance -= amount;
        return true;
    }

    public void transferTo(Account nextAccount, double amount) {
        if (this.debit(amount) == true) {
            nextAccount.credit(amount);
            System.out.println("Transfer Completed");

        }else System.out.println("Transfer not Completed");

    }

    public String accountDetails() {
        return this.name + ", the current balance in your account: " + this.id + " is $" + this.balance;
    }
}

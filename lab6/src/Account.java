public abstract class Account {
    protected double balance; // generic account code

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance; // generic account code
    }

    public void deposit(double amount) {
        balance += amount; // generic account code
    }

    @Override
    public String toString() {
        return getDescription() + ": current balance is " + balance; // generic account code
    }

    public abstract String getDescription(); // to be implemented by subclasses
    public abstract boolean withdraw(double amount); // to be implemented by subclasses
}
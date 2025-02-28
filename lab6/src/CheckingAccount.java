public class CheckingAccount extends Account {
    private final double overDraftLimit; // checking account specific code

    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance); // call parent constructor
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount(double balance) {
        this(balance, 0); // default overdraft limit is 0
    }

    @Override
    public String getDescription() {
        return "Checking Account"; // checking account specific code
    }

    @Override
    public boolean withdraw(double amount) {
        // checking account specific code
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
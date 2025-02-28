import java.util.Date;

public class TimeDepositAccount extends Account {
    // time deposit account specific code
    private final Date maturityDate;

    public TimeDepositAccount(double balance, Date maturityDate) {
        super(balance); // call parent constructor
        this.maturityDate = maturityDate;
    }

    @Override
    public String getDescription() {
        return "Time Deposit Account " + maturityDate; // time deposit account specific code
    }

    @Override
    public boolean withdraw(double amount) {
        // time deposit account specific code
        // Implement withdrawal logic for time deposit accounts
        return false; // Placeholder
    }
}
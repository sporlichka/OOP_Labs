public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts; // Changed to Account type
    private int numberOfAccounts;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
        accounts = new Account[10]; // Changed to Account type
        numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) { // Changed to Account type
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public Account getAccount(int account_index) { // Changed to Account type
        return accounts[account_index];
    }
}
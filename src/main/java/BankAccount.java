import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    public BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    public double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name you idiot
     * @param accountCategory you idiot
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void deposite(final double amount) {
        accountBalance += amount;
    }
    public void withdraw(final double amount) {
        accountBalance -= amount;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(final String name) {
        ownerName = name;
    }
    public double getInterestEarned() {
        return interestEarned;
    }
    public void setInterestEarned(double interest) {
        interestEarned = interest;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int number) {
        accountNumber = number;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
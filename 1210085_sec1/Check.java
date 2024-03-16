package ahmad1210085;
//Name:Ahmad Saqer  ID:1210085   s:3
/**
 * in class Check, payment is the same as the amount entered.
 */
public class Check extends CustomerPayment implements Payable {
    // Constants representing different types of checks
    public static final int CASHIER = 1;
    public static final int CERTIFIED = 2;
    public static final int PERSONAL = 3;

    private int accountNumber;      // Account number associated with the check
    private double accountBalance;  // Balance in the account
    private int type;               // Type of check (CASHIER, CERTIFIED, PERSONAL)

    /**
     * Default constructor.
     */
    public Check() {
    }


    public Check(String customerName, int customerId, double amount, int accountNumber, double accountBalance, int type) {
        super(customerName, customerId, amount);
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

        // Validates the type of the check
        if (type == CASHIER || type == CERTIFIED || type == PERSONAL) {
            this.type = type;
        } else {
            System.out.println("Type must be one of CASHIER, CERTIFIED, or PERSONAL.");
        }
    }

    // Getters and setters for accountNumber, accountBalance, and type

    @Override
    protected double calculatePayment() {
        // Calculates the payment amount, which is equal to the check amount
        return amount;
    }

    @Override
    void printPaymentInfo() {
        // Prints payment information specific to Check payments
        System.out.print(this.toString());
        System.out.println(" Payment = " + calculatePayment());
    }

    @Override
    public int compareTo(Object o) {
        // Uses the compareTo implementation from the superclass CustomerPayment
        return super.compareTo(o);
    }


    @Override
    public boolean isAuthorized() {
        // Authorization logic for the check
        return this.type == CASHIER || (this.amount <= this.accountBalance);
    }


    public void deductAmountFromBalance() {
        this.accountBalance -= this.amount;
    }

    @Override
    public String toString() {
        // Converts Check object data to a string format for easy readability
        return "Check [" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", type=" + type +
                ", customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", amount=" + amount +
                ']';
    }
}

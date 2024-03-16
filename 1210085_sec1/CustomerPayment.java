package ahmad1210085;
//Name:Ahmad Saqer  ID:1210085   s:3


/**
 *class CustomerPayment is Comparable based on the 
 *value returned by the method calculatePayment().
 */


abstract class CustomerPayment implements Comparable {
    // Customer's name
    protected String customerName;

    // Customer's ID
    protected int customerId;

    // Payment amount
    protected double amount;

    /**
     * Default constructor.
     * Initializes a CustomerPayment object without setting any properties.
     */
    public CustomerPayment() {
    }

    /**
     * Constructor with parameters to initialize a CustomerPayment object.
     * Sets the customer name, ID, and payment amount.
     *
     * @param customerName The name of the customer.
     * @param customerId   The ID of the customer.
     * @param amount       The amount of the payment.
     */
    public CustomerPayment(String customerName, int customerId, double amount) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.amount = amount;
    }

    /**
     * Abstract method to calculate the payment amount.
     * This method must be implemented by subclasses to define specific payment calculations.
     *
     * @return Calculated payment amount.
     */
    abstract protected double calculatePayment();

    /**
     * Abstract method to print payment information.
     * This method must be implemented by subclasses to define specific printing behavior.
     */
    abstract void printPaymentInfo();

    /**
     * Converts the CustomerPayment object data to a string format.
     * Provides a standard string representation of the customer payment details.
     *
     * @return String representation of the CustomerPayment object.
     */
    @Override
    public String toString() {
        return "CustomerPayment{" +
                "customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", amount=" + amount +
                '}';
    }

    /**
     * Compares this payment object to another based on the payment amount.
     * Implements comparison logic for sorting CustomerPayment objects.
     *
     * @param o The object to be compared.
     * @return A negative integer, zero, or a positive integer as this object
     *         is less than, equal to, or greater than the specified object.
     * @throws IllegalArgumentException If the object is not a CustomerPayment instance.
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof CustomerPayment) {
            CustomerPayment other = (CustomerPayment) o;

            // Comparison based on calculated payment amounts
            double thisPayment = this.calculatePayment();
            double otherPayment = other.calculatePayment();

            return Double.compare(thisPayment, otherPayment);
        } else {
            throw new IllegalArgumentException("Cannot compare with non-CustomerPayment object");
        }
    }
}

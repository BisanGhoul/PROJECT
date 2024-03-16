package ahmad1210085;
//Name:Ahmad Saqer  ID:1210085   s:3


/**
 * in class Cash it is calculated as the payment amount entered minus the   discountRate percentage 
 * (e.g. if amount is 200.0 and discountRate is 11.0 then payment value is 178.0)
 */

public class Cash extends CustomerPayment {
    // Attribute to store the discount rate for the cash payment
    private double discountRate;


    public Cash() {
    }

    public Cash(String customerName, int customerId, double amount, double discountRate) {
        super(customerName, customerId, amount);
        this.discountRate = discountRate;
    }


    public Cash(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }


    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * Calculates the final payment amount after applying the discount.
     * Applies the discount rate to the payment amount and returns the result.
     *
     * @return The calculated payment amount.
     */
    @Override
    protected double calculatePayment() {
        return amount - (amount * (discountRate / 100));
    }

    /**
     * Prints payment information specific to Cash payments.
     * Outputs the details of the Cash payment and the calculated payment amount.
     */
    @Override
    void printPaymentInfo() {
        System.out.print(this.toString());
        System.out.println(" Payment = " + calculatePayment());
    }

    /**
     * Compares this Cash object with another object.
     * Utilizes the compareTo implementation from the superclass CustomerPayment.
     *
     * @param o The object to be compared.
     * @return A negative integer, zero, or a positive integer as this object
     *         is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }

    /**
     * Converts Cash object data to a string format.
     * Provides a string representation of the Cash object, including its attributes.
     *
     * @return String representation of the Cash object.
     */
    @Override
    public String toString() {
        return "Cash [" +
                "discountRate=" + discountRate +
                ", customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                ", amount=" + amount +
                ']';
    }
}

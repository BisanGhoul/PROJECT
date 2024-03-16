package ahmad1210085;
//Name:Ahmad Saqer  ID:1210085   s:3

import java.util.Date;

/*
 * in class CreditCard, payment is the amount plus the chargingFee.
 */
public class CreditCard extends CustomerPayment implements Payable {
    private double chargingFee;
    private Date expiryDate;

    public CreditCard(String customerName, int customerId, double amount, double chargingFee, Date expiryDate) {
        super(customerName, customerId, amount);
        this.chargingFee = chargingFee;
        this.expiryDate = expiryDate;
    }

    
    public double calculatePayment() {
        return amount + chargingFee;
    }

    
    public boolean isAuthorized() {
        return new Date().before(expiryDate) || new Date().equals(expiryDate);
    }


	@Override
	void printPaymentInfo() {
		// TODO Auto-generated method stub
		
	}

    // toString, getters, and setters
}
package ahmad1210085;
//Name:Ahmad Saqer  ID:1210085   s:3
import java.util.*;

/**
 * we -Create a Driver class that does the following:
- *ArrayList of type CustomerPayment and adds different types of payments to 
*it (Cash, Check, CreditCard). Check or CreditCard payments should be checked if they are 
*authorized before adding them to the list.  If they are not authorized, they should not be added to the list.  
*Make sure to deduct the amount of authorized Check payments (CERTIFIED and PERSONAL only) from the accountBalance before adding 
*them to the list ( use the method deductAmountFromBalance() ).
* Sorts the ArrayList created (use Collections.sort) in descending order based on the calculated payment.
*  After sorting you should print the list to the screen using the printPaymentInfo() method.
 */



public class Driver {

    public static void main(String[] args) {
        // Creating an ArrayList to store different types of customer payments
        ArrayList<CustomerPayment> payments = new ArrayList<>();

        // Creating a Check payment for 'Rana' and checking if it is authorized before adding to the list
        CustomerPayment check1 = new Check("Rana", 7777, 400, 1111, 350, Check.PERSONAL);
        if (((Check) check1).isAuthorized()) { // Checks the authorization of the check
            payments.add(check1); // Adds to the payments list if authorized
        }

        // Creating a Cash payment for 'Ahmad' and adding it directly to the list (no authorization required)
        CustomerPayment cash = new Cash("Ahmad", 4444, 150, 5.0);
        payments.add(cash);

        // Repeating the process for another Check payment for 'Suha'
        CustomerPayment check2 = new Check("Suha", 5555, 100, 1111, 200, Check.CASHIER);
        if (((Check) check2).isAuthorized()) {
            payments.add(check2);
        }

        // Repeating for a third Check payment for 'Rania'
        CustomerPayment check3 = new Check("Rania", 7777, 600.0, 1111, 750, Check.CERTIFIED);
        if (((Check) check3).isAuthorized()) {
            payments.add(check3);
        }

        // Creating and adding a CreditCard payment for 'Randa' after checking its authorization
        CustomerPayment creditCard1 = new CreditCard("Randa", 9999, 170, 20, new Date(124, 05, 03));
        if (((CreditCard) creditCard1).isAuthorized()) {
            payments.add(creditCard1);
        }

        // Creating and adding another CreditCard payment for 'Hani'
        CustomerPayment creditCard2 = new CreditCard("Hani", 6666, 150, 10, new Date(120, 06, 07));
        if (((CreditCard) creditCard2).isAuthorized()) {
            payments.add(creditCard2);
        }

        // Sorting the payments array in descending order based on the calculated payment amount
        Collections.sort(payments);

        // Iterating over the payments list and printing out each payment's information
        for (CustomerPayment payment : payments) {
            payment.printPaymentInfo(); // Each payment type has its own print logic
        }
    }
}

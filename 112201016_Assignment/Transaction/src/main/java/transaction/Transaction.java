package transaction;

import payment.PaymentGateway;
import payment.CreditCardPayment;
import payment.DebitCardPayment;
import payment.UpiPayment;
import payment.BankTransfer;

/**
 * Creates a super class to call the other classes.
 */
public final class Transaction {
    /**
     * Function to sleep the program or given number of seconds.
     *
     * @param seconds number of seconds to sleep
     *
     */
    public static void sleep(final int seconds) {
        final int multiplier = 1000;
        try {
            Thread.sleep((long) multiplier * seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Constructor for Transaction.
     */
    private Transaction() {
    }

    /**
     * Main function to test the overall functionality.
     *
     * @param args List of arguments passed to main
     *
     */
    public static void main(final String[] args) {
        final double initialAmount = 100.00;
        System.out.println("Welcome !!! Let's learn what is abstraction...");
        sleep(1);

        System.out.println("\nWe will use a common abstract interface");
        System.out.println("for all the type of payment we are about to do.\n");
        sleep(1);

        final PaymentGateway debitCard = new DebitCardPayment(1000.0);
        debitCard.pay(initialAmount);

        System.out.println("\nThis object implements the pay from");
        System.out.println("the common interface and uses it.\n");
        sleep(1);

        final PaymentGateway creditCard = new CreditCardPayment(20.00);
        creditCard.pay(initialAmount);

        System.out.println("\nHowever this transaction module uses the");
        System.out.println("abstract interface instead of specific object.\n");
        sleep(1);

        final PaymentGateway upi = new UpiPayment(100.0);
        upi.pay(initialAmount);

        System.out.println("\nThis allows to view only the necessary");
        System.out.println("functions and abstracts the implementations.\n");
        sleep(1);

        final PaymentGateway bankTransfer = new BankTransfer(350.00);
        bankTransfer.pay(initialAmount);
        sleep(1);

        System.out.println("\nYay!!! You have learned what is abstraction...");
    }
}

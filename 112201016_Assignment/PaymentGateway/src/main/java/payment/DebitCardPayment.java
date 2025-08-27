package payment;

/**
 * Creates a class to pay via Debit Card.
 */
public class DebitCardPayment implements PaymentGateway {
    /**
     * Variable to set the amount already present in the account.
     * */
    private double accountCredit;

    /**
     * Constructor function.
     * @param initialAmount starting amount
     * */
    public DebitCardPayment(final double initialAmount) {
        System.out.println("DebitCard payment initialising...");
        accountCredit = initialAmount;
        System.out.println("Setting initial amount to " + accountCredit);
    }

    /**
     * Pay an amount from this account.
     * @param amount Amount to deduct
     * */
    @Override
    public void pay(final double amount) {
        System.out.println("Payment processing through debit card...");
        if (accountCredit >= amount) {
            System.out.println("Paying amount " + amount);
            accountCredit -= amount;
        } else {
            System.out.println("Don't have enough amount in your account...");
        }
    }

    /**
     * Return the amount remaining.
     * */
    @Override
    public double getAmount() {
        return accountCredit;
    }
}

package payment;

/**
 * Creates a common interface used by all the other classes.
 */
public interface PaymentGateway {

    /**
     * Pay an amount from this account.
     *
     * @param amount Amount to deduct
     *
     */
    void pay(double amount);

    /**
     * Returns the amount present in the account.
     *
     * @return double amount
     */
    double getAmount();
}

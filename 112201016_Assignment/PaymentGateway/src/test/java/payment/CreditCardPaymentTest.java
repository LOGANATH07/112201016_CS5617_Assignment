package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentTest {
    @Test
    void testPayMore() {
        PaymentGateway creditPayment = new CreditCardPayment(900);
        creditPayment.pay(350);
        double amountLeft = creditPayment.getAmount();
        assertEquals(550, amountLeft, "The amount is not debited properly");
    }

    @Test
    void testPayLess() {
        PaymentGateway creditPayment = new CreditCardPayment(200);
        creditPayment.pay(350);
        double amountLeft = creditPayment.getAmount();
        assertEquals(200, amountLeft, "The amount is not debited properly");
    }

}
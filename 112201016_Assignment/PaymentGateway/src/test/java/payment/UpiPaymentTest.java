package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpiPaymentTest {
    @Test
    void testPayMore() {
        PaymentGateway upiPayment = new UpiPayment(200);
        upiPayment.pay(350);
        double amountLeft = upiPayment.getAmount();
        assertEquals(200, amountLeft, "The amount is not debited properly");
    }

    @Test
    void testPayLess() {
        PaymentGateway upiPayment = new UpiPayment(600);
        upiPayment.pay(350);
        double amountLeft = upiPayment.getAmount();
        assertEquals(250, amountLeft, "The amount is not debited properly");
    }

}
package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DebitCardPaymentTest {
    @Test
    void testPayMore(){
        PaymentGateway debitPayment = new DebitCardPayment(100);
        debitPayment.pay(350);
        double amountLeft = debitPayment.getAmount();
        assertEquals(100 , amountLeft, "The amount is not debited properly");
    }

    @Test
    void testPayLess(){
        PaymentGateway debitPayment = new DebitCardPayment(500);
        debitPayment.pay(350);
        double amountLeft = debitPayment.getAmount();
        assertEquals(150 , amountLeft, "The amount is not debited properly");
    }

}
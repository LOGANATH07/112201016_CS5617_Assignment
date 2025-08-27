package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferTest {
    @Test
    void testPayMore(){
        PaymentGateway bankTransfer = new BankTransfer(1000);
        bankTransfer.pay(350);
        double amountLeft = bankTransfer.getAmount();
        assertEquals(650 , amountLeft, "The amount is not debited properly");
    }

    @Test
    void testPayLess(){
        PaymentGateway bankTransfer = new BankTransfer(100);
        bankTransfer.pay(350);
        double amountLeft = bankTransfer.getAmount();
        assertEquals(100 , amountLeft, "The amount is not debited properly");
    }
}
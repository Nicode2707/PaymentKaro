package com.nicode2707.example.PaymentKaro;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RazorPaymentService implements PaymentService{

    @Override
    public String pay(){
        String Payment = "RazorPay Payment";

        System.out.println("Payment From" + Payment);
        return Payment;
    }
}

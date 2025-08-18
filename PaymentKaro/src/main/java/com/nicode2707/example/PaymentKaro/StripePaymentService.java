package com.nicode2707.example.PaymentKaro;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class StripePaymentService implements PaymentService {

    @Override
    public String pay() {
        String Payment = "Stripe Payment";
        System.out.println("Paying from..." + Payment);
        return Payment;
    }
}
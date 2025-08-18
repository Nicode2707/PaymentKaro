package com.nicode2707.example.PaymentKaro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentKaroApplication implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(PaymentKaroApplication.class, args);
	}

    private final PaymentService paymentService;

    public PaymentKaroApplication(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) {
        String payment = paymentService.pay();
        System.out.println("Payment done: "+payment);
    }
}

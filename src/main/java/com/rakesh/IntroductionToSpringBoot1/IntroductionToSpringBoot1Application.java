package com.rakesh.IntroductionToSpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBoot1Application implements CommandLineRunner {
	@Autowired
	PaymentService paymentService;

	@Autowired
	PaymentService paymentService2;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBoot1Application.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		paymentService.pay();
		paymentService2.pay();
		System.out.println(paymentService.hashCode() +"   " + paymentService2.hashCode() );

	}
}

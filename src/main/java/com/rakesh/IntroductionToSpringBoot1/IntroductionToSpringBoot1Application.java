package com.rakesh.IntroductionToSpringBoot1;

import com.rakesh.IntroductionToSpringBoot1.impl.EmailNotificationService;
import com.rakesh.IntroductionToSpringBoot1.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBoot1Application implements CommandLineRunner {

	//@Autowired
	NotificationService notificationService;

	public IntroductionToSpringBoot1Application(NotificationService notificationService) {
		this.notificationService=notificationService;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBoot1Application.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		notificationService.sendMessage("Regarding our product purchase");

		notificationService.sendMessage("Regarding our product purchase");


	}
}

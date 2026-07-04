package com.rakesh.IntroductionToSpringBoot1;

import com.rakesh.IntroductionToSpringBoot1.impl.EmailNotificationService;
import com.rakesh.IntroductionToSpringBoot1.impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class IntroductionToSpringBoot1Application implements CommandLineRunner {

    @Autowired
	Map<String,NotificationService>notificationServiceMap=new HashMap<>();

//	public IntroductionToSpringBoot1Application( NotificationService notificationService) {
//		this.notificationService=notificationService;
//	}


	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBoot1Application.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		for(var notificationService:notificationServiceMap.entrySet()){
			System.out.println("Bean Name is "+ notificationService.getKey());
			System.out.println("Bean instance is" );
			notificationService.getValue().sendMessage("Regarding our product purchase");
		}





	}
}

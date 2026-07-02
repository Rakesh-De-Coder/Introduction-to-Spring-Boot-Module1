package com.rakesh.IntroductionToSpringBoot1.impl;

import com.rakesh.IntroductionToSpringBoot1.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendMessage(String message){
        System.out.println("Email Sending "+message);

    }


}

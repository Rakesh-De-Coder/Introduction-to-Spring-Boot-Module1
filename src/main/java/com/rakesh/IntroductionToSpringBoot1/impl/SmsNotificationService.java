package com.rakesh.IntroductionToSpringBoot1.impl;

import com.rakesh.IntroductionToSpringBoot1.NotificationService;
import org.springframework.stereotype.Component;

//@Component
public class SmsNotificationService implements NotificationService {


    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Sms .."+ message);
    }
}

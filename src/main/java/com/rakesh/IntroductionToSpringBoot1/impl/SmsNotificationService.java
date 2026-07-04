package com.rakesh.IntroductionToSpringBoot1.impl;

import com.rakesh.IntroductionToSpringBoot1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "notification.type" , havingValue = "sms")
public class SmsNotificationService implements NotificationService {


    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Sms .."+ message);
    }
}

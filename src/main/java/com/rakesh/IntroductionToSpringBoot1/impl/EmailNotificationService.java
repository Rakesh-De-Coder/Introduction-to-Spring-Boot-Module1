package com.rakesh.IntroductionToSpringBoot1.impl;

import com.rakesh.IntroductionToSpringBoot1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(name = "notification.type" , havingValue = "email")
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendMessage(String message){
        System.out.println("Email Sending "+message);

    }


}

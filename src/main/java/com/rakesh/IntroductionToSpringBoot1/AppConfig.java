package com.rakesh.IntroductionToSpringBoot1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public  PaymentService getPaymentService(){
        return  new PaymentService();
    }
}

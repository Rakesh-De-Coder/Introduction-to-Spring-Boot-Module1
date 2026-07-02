package com.rakesh.IntroductionToSpringBoot1;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class PaymentService {
    public void pay(){
        System.out.println("Paying ...");
    }
    @PostConstruct
    public  void postConstruct(){
        System.out.println("Before bean create");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Just before bean destroy");
    }
}

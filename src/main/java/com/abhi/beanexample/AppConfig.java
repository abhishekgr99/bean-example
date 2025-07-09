package com.abhi.beanexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(value="Paypal")
    Payment payment(){
        Payment p = new Payment();
        p.setProviderName("Paypal");
        return p;
    }

    @Bean(name="Paytm")
    Payment payment1(){
        Payment p = new Payment();
        p.setProviderName("Paytm");
        return p;
    }

    @Bean
    Payment payment2(){
        Payment p = new Payment();
        p.setProviderName("GPay");
        return p;
    }

    @Bean
    String name(){
        return "AbhiPay";
    }
}

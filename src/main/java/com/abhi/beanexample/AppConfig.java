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
}

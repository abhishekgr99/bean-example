package com.abhi.beanexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    // @Primary annotation used as default bean when multiple bean's was initiated with same type(Payment) to avoid ambiguity exceptions
    @Primary
    @Bean
    Payment payment3(){
        Payment p = new Payment();
        p.setProviderName("Rapipay");
        return p;
    }

    @Bean
    String name(){
        return "AbhiPay";
    }
}

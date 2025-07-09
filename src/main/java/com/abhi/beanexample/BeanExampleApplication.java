package com.abhi.beanexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanExampleApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// reading it by custom name/value
		Payment payment = context.getBean("Paypal", Payment.class);
		System.out.println(payment.getProviderName());

		// reading it by custom name
		Payment payment1 = context.getBean("Paytm", Payment.class);
		System.out.println(payment1.getProviderName());

		// reading it by method name
		Payment payment2 = context.getBean("payment2", Payment.class);
		System.out.println(payment2.getProviderName());

		String name = context.getBean(String.class);
		System.out.println(name);
	}

}

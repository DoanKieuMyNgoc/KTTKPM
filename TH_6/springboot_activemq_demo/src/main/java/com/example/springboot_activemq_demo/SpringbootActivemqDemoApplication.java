package com.example.springboot_activemq_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class SpringbootActivemqDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootActivemqDemoApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringbootActivemqDemoApplication .class, args);

		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("javainuse", "test message");
	}

}

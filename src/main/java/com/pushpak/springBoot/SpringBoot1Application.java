package com.pushpak.springBoot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		
		//create context
		ApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);
		
		Alien obj = context.getBean(Alien.class);
		
		obj.code();
		
	}

}

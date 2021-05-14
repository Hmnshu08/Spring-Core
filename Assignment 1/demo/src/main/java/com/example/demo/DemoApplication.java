package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//Q1
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = (Customer)applicationContext.getBean("customer");
//		customer.showInfo();
		System.out.println(customer);
		
		
		
		
		
		
		
		
		
	}

}

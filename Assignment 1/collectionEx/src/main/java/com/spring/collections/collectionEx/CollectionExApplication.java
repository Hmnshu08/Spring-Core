package com.spring.collections.collectionEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CollectionExApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CollectionExApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Questions c=(Questions)context.getBean("questions");

	      c.getQuestionId();
	      c.getQuestion();
	      c.getAnswers();
		
		
		
	}

}

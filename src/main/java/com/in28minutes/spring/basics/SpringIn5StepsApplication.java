package com.in28minutes.spring.basics;

import com.in28minutes.spring.basics.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		Student student = applicationContext.getBean(Student.class);
		student.getDetails();

	}
}


/*
* if there are multiple candidate for a dependency in a class then
* 1. Can use @Primary annotation on one of them
* 2. Can use dependency variable name as specified name
* 3. Can use Qualifier
* @Autowired
* e.g ISortAlogorithm bulbbleSort ;
* 3. @Primary has higher priority if you use both
*
* */
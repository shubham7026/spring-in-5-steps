package com.in28minutes.spring.basics.entity;

import com.in28minutes.spring.basics.models.Laptop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.in28minutes.spring.basics.models")
@SpringBootApplication
public class SpringIn5StepsApplication {

	private static Logger  LOGGER = LoggerFactory.getLogger("SpringIn5StepsApplication");
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

		/*MCA mca = applicationContext.getBean(MCA.class);
		MCA mca1 = applicationContext.getBean(MCA.class);
		if (mca == mca1) {
			LOGGER.info("singleton : {} , {}", mca.hashCode(), mca1.hashCode());
			LOGGER.info("singleton : {} , {}", mca.semester.hashCode(), mca1.semester.hashCode());
		}
		else {
			LOGGER.info("prototype : {} , {}", mca.hashCode(), mca1.hashCode());
			LOGGER.info("singleton : {} , {}", mca.semester.hashCode(), mca1.semester.hashCode());
		}*/
		/*BTech bTech = applicationContext.getBean(BTech.class);
		BTech bTech1 = applicationContext.getBean(BTech.class);
		if(bTech1==bTech){
			LOGGER.info("Singleton : {} {}",bTech1.hashCode(),bTech.hashCode());
			LOGGER.info("prototype : {} {}",bTech1.department.hashCode(),bTech.department.hashCode());
		}
*/
		//Student student = applicationContext.getBean(Student.class);
		//student.getDetails();
		Laptop laptop = applicationContext.getBean(Laptop.class);

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


/*
* Default bean scope is singleton
* If you need protoType scope mark that class as @scope("prototype), like MCA class
* lets have 2 class where A depends on B
* class A{
*  B;
* }
* if A is of prototype declared then B is singleton untill declared
* if A is singleton and B is prototype still u will get 2 different beans of B.
* to resolve above issue
*
* */
package it.johnson.demo;

import it.johnson.demo.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	// 1. Injection tramite application ctx --> eseguire il test

	@Test
	void getControllerFromCtx(){
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	// 2. injection tramite l'istanza del controller --> eseguire il test

	@Test
	void testAutowiredOfController(){
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}

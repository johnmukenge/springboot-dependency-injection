package it.johnson.demo;

import it.johnson.demo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// scan di tutto il context dell'app
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("Sono il metodo Main");

		System.out.println(controller.sayHello());

	}

}

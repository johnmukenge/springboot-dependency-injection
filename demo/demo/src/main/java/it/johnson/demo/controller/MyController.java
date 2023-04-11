package it.johnson.demo.controller;

import it.johnson.demo.services.GreetingService;
import it.johnson.demo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Sono il controller...");

        return greetingService.sayGreeting();
    }
}

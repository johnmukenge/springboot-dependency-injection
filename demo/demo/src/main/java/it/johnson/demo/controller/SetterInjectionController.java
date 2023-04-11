package it.johnson.demo.controller;

import it.johnson.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {


    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SetterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

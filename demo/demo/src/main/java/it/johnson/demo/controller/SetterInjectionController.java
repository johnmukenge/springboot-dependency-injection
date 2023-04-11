package it.johnson.demo.controller;

import it.johnson.demo.services.GreetingService;

public class SetterInjectionController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

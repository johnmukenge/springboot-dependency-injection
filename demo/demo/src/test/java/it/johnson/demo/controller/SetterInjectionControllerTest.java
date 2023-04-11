package it.johnson.demo.controller;

import it.johnson.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController setterInjectionController;

    @BeforeEach
    void setUp(){

        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setGreetingService(new GreetingServiceImpl());// if you don't set the impl you'll get a nullpointer
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectionController.sayHello());
    }
}
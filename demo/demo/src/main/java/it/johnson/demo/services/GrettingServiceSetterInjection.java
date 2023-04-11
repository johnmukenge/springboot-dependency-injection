package it.johnson.demo.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GrettingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey, I'm setting a gretting!!";
    }
}

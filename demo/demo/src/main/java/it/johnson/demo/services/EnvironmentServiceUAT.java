package it.johnson.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service()
public class EnvironmentServiceUAT implements EnvironmentService{
    @Override
    public String getEnv() {
        return "UAT";
    }
}

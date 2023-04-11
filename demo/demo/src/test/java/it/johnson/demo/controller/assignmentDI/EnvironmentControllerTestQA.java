package it.johnson.demo.controller.assignmentDI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("QA")
@SpringBootTest
class EnvironmentControllerTestQA {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}
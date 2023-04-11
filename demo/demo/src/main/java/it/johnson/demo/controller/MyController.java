package it.johnson.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    //2. dall'annotation, Spring capisce che si tratta di un spring bean
    // il context crea una istanza di MyController e lo tiene nel ctx
    // e quando serve, spring provvede l'istanza del componente che si era tenuto nel spring ctx

    public String sayHello(){
        System.out.println("Sono il controller...");

        return "Ciao a tutti!!!";
    }
}

package com.prograd.MicroServicesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private NumConfiguration numConfiguration;
    @GetMapping("/maxMin")
    public NumConfiguration retrieveMaxNin(){
        return new NumConfiguration(numConfiguration.getMin(),numConfiguration.getMax());
    }


}

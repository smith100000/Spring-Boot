
package com.Prograd.HelloWorldDemo1.Democontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Demo {
    @GetMapping("/1234")
    public String name(){
        return "Gopi";
    }
}

package edu.utp.demoapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/saludo")
    public String saludo(){
        return "Hola desde un controller";
    }

}

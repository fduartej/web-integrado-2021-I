package edu.utp.demoapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    
    @GetMapping("/saludo")
    public String saludo(Model model){
        model.addAttribute("name", "Hola desde un controller");
        return "saludo";
    }

}

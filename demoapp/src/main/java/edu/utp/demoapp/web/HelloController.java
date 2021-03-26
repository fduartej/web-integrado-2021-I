package edu.utp.demoapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import edu.utp.demoapp.model.Persona;

@Controller
public class HelloController {
    
    @GetMapping("/saludo")
    public String mimetodo(Model model){
        Persona p = new Persona();
        p.setFirstName("Bryan");
        p.setLastName("Romero");
        model.addAttribute("persona", p);
        model.addAttribute("name", "desde un controller");
        return "mypagina";
    }

}

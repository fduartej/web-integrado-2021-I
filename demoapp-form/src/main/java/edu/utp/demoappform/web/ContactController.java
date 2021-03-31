package edu.utp.demoappform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import edu.utp.demoappform.model.Contact;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contact(Model model){
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "contact/index";
    }

    @PostMapping("/contact/create")
    public String postSubmitForm(Model model ){
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        model.addAttribute("mensaje", "Se registro un contacto");
        return "contact/index";
    }
    
}

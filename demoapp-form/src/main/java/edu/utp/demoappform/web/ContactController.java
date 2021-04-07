package edu.utp.demoappform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import edu.utp.demoappform.model.Contact;

import org.springframework.validation.BindingResult;

import javax.validation.Valid;

@Controller
public class ContactController {

    @GetMapping("/")
    public String contact(Model model){
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "contact/index";
    }

    @PostMapping("/contact/create")
    public String postSubmitForm(Model model, @Valid Contact objContact, BindingResult result ){
        objContact.setChildrens(objContact.getChildrens()*2);
        model.addAttribute("contact", objContact);
        model.addAttribute("mensaje", "Se registro un contacto");
        return "contact/index";
    }
    
}

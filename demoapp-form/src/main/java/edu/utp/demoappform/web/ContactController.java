package edu.utp.demoappform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import edu.utp.demoappform.model.Contact;

import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.*;

@Controller
public class ContactController {

    private static String MODEL_CONTACT="contact";

    @GetMapping("/")
    public String contact(Model model){
        Contact contact1 = new Contact();
        contact1.setName("jhon");
        contact1.setEmail("jhon@gmail.com");
        List<Contact> listContacto =new ArrayList<Contact>();
        listContacto.add(contact1);

        Contact contact2 = new Contact();
        contact2.setName("jhon1");
        contact2.setEmail("jhon1@gmail.com");
        listContacto.add(contact2);

        model.addAttribute("contactos",listContacto);
        return "contact/index";
    }

    @GetMapping("/contact/create")
    public String create(Model model){
        Contact contact = new Contact();
        model.addAttribute(MODEL_CONTACT, contact);
        return "contact/create";
    }    

    @PostMapping("/contact/create")
    public String createSubmitForm(Model model, 
        @Valid Contact objContact, BindingResult result ){
        if(result.hasFieldErrors()) {
            model.addAttribute("mensaje", "No se registro un contacto");
        }else{
            objContact.setChildrens(objContact.getChildrens());
            model.addAttribute(MODEL_CONTACT, objContact);
            model.addAttribute("mensaje", "Se registro un contacto");
        }
        return "contact/create";
    }
    
}

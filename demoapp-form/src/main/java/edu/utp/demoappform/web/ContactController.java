package edu.utp.demoappform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import edu.utp.demoappform.model.Contact;

import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;


import edu.utp.demoappform.repository.ContactRepository;
@Controller
public class ContactController {

    private static String MODEL_CONTACT="contact";
    private final ContactRepository contactsData;

    public ContactController(ContactRepository contactsData){
        this.contactsData = contactsData;
    }

    @GetMapping("/")
    public String contact(Model model){
        List<Contact> listContacto = this.contactsData.findAll();
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
            this.contactsData.save(objContact);
            model.addAttribute(MODEL_CONTACT, objContact);
            model.addAttribute("mensaje", "Se registro un contacto");
        }
        return "contact/create";
    }

    @GetMapping("/contact/edit/{id}")
    public String edit(@PathVariable("id") int id, 
        Model model){
        Contact contact = this.contactsData.getOne(id);
        model.addAttribute(MODEL_CONTACT, contact);
        return "contact/edit";
    }  

    @PostMapping("/contact/edit")
	public String update(
			@Valid Contact contact,
			BindingResult bindingResult
			){
		if(bindingResult.hasFieldErrors()) {
			return "redirect:/contact/edit/{id}";
		}
		this.contactsData.save(contact);
		return "redirect:/";
	}
    
}

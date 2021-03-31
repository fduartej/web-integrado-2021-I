package edu.utp.demoappform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String contact(){
        return "contact/index";
    }

    @PostMapping("/contact/create")
    public String postSubmitForm(){
        return "contact/index";
    }
    
}

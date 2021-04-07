package edu.utp.demoappform.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;


public class Contact {
    private String name;
    private String email;
    private String phone; 
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birtdate; //Fecha
    private String gender; //Radio
    private String maritalStatus; //List Box
    private Integer childrens; //Numero

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirtdate() {
        return this.birtdate;
    }

    public void setBirtdate(Date birtdate) {
        this.birtdate = birtdate;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getChildrens() {
        return this.childrens;
    }

    public void setChildrens(Integer childrens) {
        this.childrens = childrens;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}

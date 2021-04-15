package edu.utp.demoappform.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Table(name = "t_contact")
public class Contact {
    @Id
	private Integer id;
    @NotNull
    private String name;
    private String email;

    @Transient
    private String phone; 
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Transient
    private Date birtdate; //Fecha
    @Transient
    private String gender; //Radio
    @Transient
    private String maritalStatus; //List Box
    @Transient
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

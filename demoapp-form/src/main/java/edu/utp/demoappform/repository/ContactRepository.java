package edu.utp.demoappform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.utp.demoappform.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{
    
}

package com.lakshan.contactmanager.controller;

import com.lakshan.contactmanager.model.Contact;
import com.lakshan.contactmanager.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    ContactService contactService;

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public Contact save(@RequestBody Contact contact) {
        return contactService.save(contact);
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public ResponseEntity<Contact> fetchContact(@RequestParam int id) {
        Contact contact = contactService.fetchContactById(id);
        if (contact == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(contact);
        }
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public List<Contact> getContacts() {
        return contactService.getAllContacts();
    }
}

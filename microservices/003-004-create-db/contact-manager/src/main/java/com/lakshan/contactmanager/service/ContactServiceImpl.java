package com.lakshan.contactmanager.service;

import com.lakshan.contactmanager.model.Contact;
import com.lakshan.contactmanager.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact fetchContactById(int id) {
        Optional<Contact> contact=contactRepository.findById(id);
        if(contact.isPresent()){
            return contact.get();
        }
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}

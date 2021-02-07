package com.lakshan.contactmanager.service;

import com.lakshan.contactmanager.model.Contact;

import java.util.List;

public interface ContactService {
    Contact save(Contact contact);

    Contact fetchContactById(int id);

    List<Contact> getAllContacts();
}

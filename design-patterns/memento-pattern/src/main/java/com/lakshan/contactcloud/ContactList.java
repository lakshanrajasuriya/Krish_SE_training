package com.lakshan.contactcloud;

import java.util.ArrayList;

// Originator
public class ContactList {
    ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> getContacts() {
        return (ArrayList<Contact>) contacts.clone();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public ContactMemento save() {
        return new ContactMemento(getContacts());
    }

    public void revert(ContactMemento contactMemento) {
        contacts = contactMemento.getContacts();
    }

    @Override
    public String toString() {
        return "Contact List { " +
                contacts +
                '}';
    }

    static class ContactMemento {
        ArrayList<Contact> contacts;

        public ContactMemento(ArrayList<Contact> contacts) {
            this.contacts = contacts;
        }

        // make this method private so only contactList can access this method
        private ArrayList<Contact> getContacts() {
            return contacts;
        }
    }
}

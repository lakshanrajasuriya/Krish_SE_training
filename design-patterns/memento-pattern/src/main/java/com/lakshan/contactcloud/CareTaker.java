package com.lakshan.contactcloud;

import java.util.Stack;

public class CareTaker {
    Stack<ContactList.ContactMemento> history = new Stack<>();

    public void save(ContactList contactList) {
        history.push(contactList.save());
    }

    public void revert(ContactList contactList) {
        if (!history.isEmpty())
            contactList.revert(history.pop());
        else
            System.out.println("Cannot undo");
    }
}

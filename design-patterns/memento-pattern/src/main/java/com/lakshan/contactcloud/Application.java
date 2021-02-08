package com.lakshan.contactcloud;

public class Application {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        CareTaker careTaker = new CareTaker();

        contactList.addContact(new Contact("Lakshan", "0772296488", "lakshan@gmail.com"));
        careTaker.save(contactList);

        contactList.addContact(new Contact("Dasun", "0761146598", "dasun@gmail.com"));
        careTaker.save(contactList);

        contactList.addContact(new Contact("Saduni", "0718395829", "saduni@gmail.com"));

        System.out.println(contactList + "\n");

        System.out.println("Revert");
        careTaker.revert(contactList);
        System.out.println(contactList);
        System.out.println();

        System.out.println("Revert");
        careTaker.revert(contactList);
        System.out.println(contactList);
        System.out.println();

        System.out.println("Revert");
        careTaker.revert(contactList);
        System.out.println(contactList);
    }
}

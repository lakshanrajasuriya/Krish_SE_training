package com.lakshan.contactcloud;

public class Contact {
    String name;
    String contactNo;
    String email;

    public Contact(String name, String contactNo, String email) {
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact {" +
                "name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

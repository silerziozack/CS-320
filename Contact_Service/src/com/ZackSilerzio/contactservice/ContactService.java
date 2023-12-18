package com.ZackSilerzio.contactservice;

//ContactService.java
import java.util.HashMap;
import java.util.Map;

public class ContactService {
 private final Map<String, Contact> contacts;

 public ContactService() {
     this.contacts = new HashMap<>();
 }

 public void addContact(Contact contact) {
     contacts.put(contact.getContactId(), contact);
 }

 public void deleteContact(String contactId) {
     contacts.remove(contactId);
 }

 public void updateContactField(String contactId, String fieldName, String newValue) {
     Contact contact = contacts.get(contactId);

     if (contact != null) {
         switch (fieldName) {
             case "firstName":
                 contact.setFirstName(newValue);
                 break;
             case "lastName":
                 contact.setLastName(newValue);
                 break;
             case "phone":
                 contact.setPhone(newValue);
                 break;
             case "address":
                 contact.setAddress(newValue);
                 break;
             default:
                 // Handle invalid field name
                 throw new IllegalArgumentException("Invalid field name");
         }
     }
 }
}

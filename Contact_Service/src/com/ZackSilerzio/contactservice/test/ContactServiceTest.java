package com.ZackSilerzio.contactservice.test;

//ContactServiceTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

 @Test
 public void testAddContact() {
     ContactService contactService = new ContactService();
     Contact contact = new Contact("123", "John", "Doe", "1234567890", "Sample St");

     contactService.addContact(contact);

     assertTrue(contactService.getContacts().containsKey("123"));
 }

 @Test
 public void testDeleteContact() {
     ContactService contactService = new ContactService();
     Contact contact = new Contact("123", "John", "Doe", "1234567890", "Sample St");
     contactService.addContact(contact);

     contactService.deleteContact("123");

     assertFalse(contactService.getContacts().containsKey("123"));
 }

 @Test
 public void testUpdateContactField() {
     ContactService contactService = new ContactService();
     Contact contact = new Contact("123", "John", "Doe", "1234567890", "Sample St");
     contactService.addContact(contact);

     contactService.updateContactField("123", "firstName", "Jane");
     assertEquals("Jane", contact.getFirstName());

     contactService.updateContactField("123", "lastName", "Smith");
     assertEquals("Smith", contact.getLastName());

     contactService.updateContactField("123", "phone", "9876543210");
     assertEquals("9876543210", contact.getPhone());

     contactService.updateContactField("123", "address", "New St");
     assertEquals("New St", contact.getAddress());
 }
}


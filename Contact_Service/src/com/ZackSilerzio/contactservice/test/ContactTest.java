package com.ZackSilerzio.contactservice.test;

// ContactTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testContactInitialization() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "Sample St");

        assertEquals("123", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("Sample St", contact.getAddress());
    }

    @Test
    public void testContactFieldUpdate() {
        Contact contact = new Contact("123", "John", "Doe", "1234567890", "Sample St");

        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());

        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());

        contact.setPhone("9876543210");
        assertEquals("9876543210", contact.getPhone());

        contact.setAddress("New St");
        assertEquals("New St", contact.getAddress());
    }
}

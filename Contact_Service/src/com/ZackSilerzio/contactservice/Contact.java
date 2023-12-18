package com.ZackSilerzio.contactservice;

//Contact.java
public class Contact {
 private final String contactId;
 private String firstName;
 private String lastName;
 private String phone;
 private String address;

 public Contact(String contactId, String firstName, String lastName, String phone, String address) {
     validateContactId(contactId);
     validateName(firstName, "First Name");
     validateName(lastName, "Last Name");
     validatePhone(phone);
     validateAddress(address);

     this.contactId = contactId;
     this.firstName = firstName;
     this.lastName = lastName;
     this.phone = phone;
     this.address = address;
 }

 public String getContactId() {
     return contactId;
 }

 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     validateName(firstName, "First Name");
     this.firstName = firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     validateName(lastName, "Last Name");
     this.lastName = lastName;
 }

 public String getPhone() {
     return phone;
 }

 public void setPhone(String phone) {
     validatePhone(phone);
     this.phone = phone;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     validateAddress(address);
     this.address = address;
 }

 private void validateContactId(String contactId) {
     if (contactId == null || contactId.length() > 10) {
         throw new IllegalArgumentException("Contact ID must be non-null and have a maximum length of 10 characters.");
     }
 }

 private void validateName(String name, String fieldName) {
     if (name == null || name.length() > 10) {
         throw new IllegalArgumentException(fieldName + " must be non-null and have a maximum length of 10 characters.");
     }
 }

 private void validatePhone(String phone) {
     if (phone == null || phone.length() != 10) {
         throw new IllegalArgumentException("Phone must be non-null and have exactly 10 digits.");
     }
 }

 private void validateAddress(String address) {
     if (address == null || address.length() > 30) {
         throw new IllegalArgumentException("Address must be non-null and have a maximum length of 30 characters.");
     }
 }
}


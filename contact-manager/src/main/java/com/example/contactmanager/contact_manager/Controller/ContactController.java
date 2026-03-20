package com.example.contactmanager.contact_manager.Controller;

import com.example.contactmanager.contact_manager.Entity.Contact;
import com.example.contactmanager.contact_manager.Service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    // Add contact
    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return service.addContact(contact);
    }

    // Get all contacts
    @GetMapping
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }

    // Get contact by ID
    @GetMapping("/{id}")
    public Contact getContact(@PathVariable Long id) {
        return service.getContactById(id);
    }

    // Delete contact
    @DeleteMapping("/{id}")
    public String deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
        return "Contact deleted successfully";
    }
}
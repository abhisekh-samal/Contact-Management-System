package com.example.contactmanager.contact_manager.Service;

import com.example.contactmanager.contact_manager.Entity.Contact;
import com.example.contactmanager.contact_manager.Repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    // Add contact
    public Contact addContact(Contact contact) {
        return repository.save(contact);
    }

    // Get all contacts
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    // Get contact by ID
    public Contact getContactById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Delete contact
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}
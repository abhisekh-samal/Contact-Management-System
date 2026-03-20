package com.example.contactmanager.contact_manager.Repository;

import com.example.contactmanager.contact_manager.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}